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
            
            String gameTagString = "Unstable_Unicorns_Game_" + startTime;
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
                        if (gameTagString.contentEquals(receiveString))
                            foundOpponent = true;
                    }
            }

            udpSocket.close();

            long opponentStartTime = Long.parseLong(gameTagString.substring(23, receiveString.length()));
            
            System.out.println("Success! IP: " + receivePacket.getAddress() + " Port: " + receivePacket.getPort());

            ServerSocket receiveSocket = new ServerSocket(PORT);
            Socket sendSocket = new Socket(receivePacket.getAddress(), PORT);

            Thread.sleep(1000);

            receiveSocket.close();
            sendSocket.close();

        } catch(Exception e) {
            System.out.println("Error! " + e.getMessage());
        }
    }
}
