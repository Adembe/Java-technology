package Seminar11;
import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class summationThread extends Thread {
    Socket clientSocket;
    ArrayList arr;
    summationThread(Socket cs){
        clientSocket = cs;
    }
    public void run( ){
        try{
            arr = new ArrayList();
            ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream( ));
            int count = Integer.parseInt(ois.readLine( ));
            arr.add(count);
            PrintStream ps = new PrintStream(clientSocket.getOutputStream( ));
            ps.println(arr);
            ps.flush( );
            clientSocket.close( );
        }
        catch(Exception e){e.printStackTrace( );}
    }
}
