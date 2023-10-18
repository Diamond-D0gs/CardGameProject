package Game;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class NetworkHandler implements AutoCloseable {
    public static final int MAX_BROADCAST_ATTEMPTS = Short.MAX_VALUE;
    public static final int MAX_RECEIVE_TIME = 10000; // Milliseconds
    public static final int PORT = 4567;

    private ByteBuffer receiveBuffer;
    private ByteBuffer sendBuffer;

    private Socket tcpSocket = null;
    private ServerSocket serverSocket = null;
    private long startTime = 0;
    private long opponentStartTime = 0;

    public NetworkHandler() {
        receiveBuffer = ByteBuffer.wrap(new byte[1024]);
        sendBuffer = ByteBuffer.wrap(new byte[1024]);
    }

    public boolean FindConnection() {
        try {
            startTime = System.currentTimeMillis();

            InetAddress broadcastAddr = null;
            InetAddress hostAddr = Inet4Address.getLocalHost();
            NetworkInterface networkInterface = NetworkInterface.getByInetAddress(hostAddr);
            for (InterfaceAddress interfaceAddr : networkInterface.getInterfaceAddresses()) {
                broadcastAddr = interfaceAddr.getBroadcast();
                if (broadcastAddr != null)
                    break;
            }

            if (broadcastAddr == null) {
                System.out.println("Error! Could not get broadcast address.");
                return false;
            }

            String receiveString = null;
            String gameTagName = "Unstable_Unicorns_Game_";
            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer.array(), receiveBuffer.array().length);
            
            try (DatagramSocket udpSocket = new DatagramSocket(PORT, hostAddr)) {
                udpSocket.setSoTimeout(MAX_RECEIVE_TIME);
                udpSocket.setBroadcast(true);
                
                String gameTagString = gameTagName + startTime;
                byte[] gameTagBytes = gameTagString.getBytes();
                DatagramPacket gameTagPacket = new DatagramPacket(gameTagBytes, gameTagBytes.length, broadcastAddr, PORT);

                boolean foundOpponent = false;
                while(!foundOpponent) {
                    udpSocket.send(gameTagPacket);

                    try {
                        udpSocket.receive(receivePacket);
                    }
                    catch (SocketTimeoutException e) {
                        System.out.println("Could not find opponent on network. Trying again...");
                        continue;
                    }

                    if (!Arrays.equals(receivePacket.getAddress().getAddress(), hostAddr.getAddress()))
                        if (receivePacket.getLength() > 0) {
                            receiveString = new String(receivePacket.getData(), 0, receivePacket.getLength());
                            if (gameTagString.contains(gameTagName))
                                foundOpponent = true;
                        }
                }
            }

            opponentStartTime = Long.parseLong(receiveString.substring(gameTagName.length(), receiveString.length()));
            
            System.out.println("Success! Opponent's IP: " + receivePacket.getAddress() + " Port: " + receivePacket.getPort());

            if (startTime < opponentStartTime) {
                serverSocket = new ServerSocket(PORT);
                serverSocket.setSoTimeout(1000);
                tcpSocket = serverSocket.accept();
            }
            else
                tcpSocket = new Socket(receivePacket.getAddress(), PORT);

            System.out.println("TCP Connection successfully established! " + ((startTime < opponentStartTime) ? "This end is the server." : "This end is the client.") + "\n");
        } catch(Exception e) {
            System.out.println("Error! " + e.getMessage());
            return false;
        }

        return true;
    }

    public void close() throws IOException {
        if (tcpSocket != null)
            tcpSocket.close();
        if (serverSocket != null)
            serverSocket.close();
    }
}
