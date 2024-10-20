package Seminar11;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;

public class summationClient {
    public static void main(String[ ] args){
        try{
            InetAddress serverHost = InetAddress.getByName("10.3.130.192");
            int serverPort = Integer.parseInt("12345");
            long startTime = System.currentTimeMillis( );
            String count = ("hahhaha");
            Socket clientSocket = new Socket(serverHost, serverPort);
            PrintStream ps = new PrintStream(clientSocket.getOutputStream());
            ps.println(count);
            ObjectOutputStream ois = new ObjectOutputStream(clientSocket.getOutputStream());
            ois.writeObject(count);
            long endTime = System.currentTimeMillis();
            System.out.println(" Time consumed for receiving the feedback from the server:"+(endTime-startTime)+" milliseconds");
                    clientSocket.close( );
        }
        catch(Exception e){e.printStackTrace( );}
    }
}
