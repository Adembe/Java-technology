package Seminar11;

import java.net.ServerSocket;
import java.net.Socket;

public class summationServer {
    public static void main(String[ ] args){
        try{
            int serverPort = Integer.parseInt("23456");
            ServerSocket calcServer = new ServerSocket(serverPort);
            while (true){
                Socket clientSocket = calcServer.accept( );
                summationThread thread = new summationThread(clientSocket);
                thread.start( );
            }
        }
        catch(Exception e){e.printStackTrace( );}
    }
}
