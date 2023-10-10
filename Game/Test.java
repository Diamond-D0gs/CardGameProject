package Game;

import java.net.*;
import java.util.Arrays;

public class Test {
    public static final int MAX_BROADCAST_ATTEMPTS = Short.MAX_VALUE;
    public static final int MAX_RECEIVE_TIME = 10000; // Milliseconds
    public static final int PORT = 4567;

    public static void main(String[] args) {
        try {
            long startTime = System.currentTimeMillis();

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
                return;
            }

            DatagramSocket udpSocket = new DatagramSocket(PORT, hostAddr);
            udpSocket.setSoTimeout(MAX_RECEIVE_TIME);
            udpSocket.setBroadcast(true);
            
            String gameTagName = "Unstable_Unicorns_Game_";
            String gameTagString = gameTagName + startTime;
            byte[] gameTagBytes = gameTagString.getBytes();
            DatagramPacket gameTagPacket = new DatagramPacket(gameTagBytes, gameTagBytes.length, broadcastAddr, PORT);

            byte[] receiveBuffer = new byte[256];
            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);

            String receiveString = null;
            boolean foundOpponent = false;
            while(!foundOpponent) {
                udpSocket.send(gameTagPacket);

                try {
                    udpSocket.receive(receivePacket);
                }
                catch (SocketTimeoutException e) {
                    continue;
                }

                if (!Arrays.equals(receivePacket.getAddress().getAddress(), hostAddr.getAddress()))
                    if (receivePacket.getLength() > 0) {
                        receiveString = new String(receivePacket.getData(), 0, receivePacket.getLength());
                        if (gameTagString.contains(gameTagName))
                            foundOpponent = true;
                    }
            }

            udpSocket.close();

            long opponentStartTime = Long.parseLong(receiveString.substring(gameTagName.length(), receiveString.length()));
            
            System.out.println("Success! IP: " + receivePacket.getAddress() + " Port: " + receivePacket.getPort());

            Socket tcpSocket = null;
            ServerSocket serverSocket = null;
            if (startTime < opponentStartTime) {
                serverSocket = new ServerSocket(PORT);
                serverSocket.setSoTimeout(1000);
                tcpSocket = serverSocket.accept();
            }
            else
                tcpSocket = new Socket(receivePacket.getAddress(), PORT);

            System.out.println("TCP Connection successfully established! " + ((startTime < opponentStartTime) ? "This end is the server." : "This end is the client."));

            tcpSocket.close();
            if (serverSocket != null)
                serverSocket.close();

        } catch(Exception e) {
            System.out.println("Error! " + e.getMessage());
        }
    }
}
