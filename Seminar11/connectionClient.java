package Seminar11;

import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class connectionClient {
    public static void main(String[] args){
        try{
            InetAddress serverHost = InetAddress.getByName("10.3.130.192");
            int serverPortNum = Integer.parseInt("12345");
            ArrayList arr = new ArrayList();

            Socket clientSocket = new Socket(serverHost, serverPortNum);
            ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream( ));
            oos.writeObject(arr);
            oos.flush( );
            clientSocket.close( );
        }
        catch(Exception e){e.printStackTrace( );}
    }
}
