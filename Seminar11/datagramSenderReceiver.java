package Seminar11;

import java.net.*;

class datagramSenderReceiver{
    public static void main(String[ ] args){
        try{
            InetAddress receiverHost = InetAddress.getByName("10.3.130.192");
            int receiverPort = Integer.parseInt("12345");
            String message = "Hi bishdaa min";
            DatagramSocket mySocket = new DatagramSocket( );
            byte[] sendBuffer = message.getBytes( );
            DatagramPacket packet = new DatagramPacket(sendBuffer, sendBuffer.length,
                    receiverHost, receiverPort);
            mySocket.send(packet);
            int MESSAGE_LEN = 60;
            byte[ ] recvBuffer = new byte[MESSAGE_LEN];
            DatagramPacket datagram = new DatagramPacket(recvBuffer, MESSAGE_LEN);
            mySocket.receive(datagram);
            String recvdString = new String(recvBuffer);
            System.out.println("\n"+recvdString);

            mySocket.close( );
        }
        catch(Exception e){ e.printStackTrace( ); }
    }
}