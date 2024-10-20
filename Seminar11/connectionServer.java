package Seminar11;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class connectionServer {
    public static void main(String[] args){
        try{
            int serverListenPortNum = Integer.parseInt("12345");
            ServerSocket connectionSocket = new ServerSocket(serverListenPortNum);
            Socket dataSocket = connectionSocket.accept( );
            ObjectInputStream ois = new ObjectInputStream(dataSocket.getInputStream( ));
            EmployeeData eData = (EmployeeData) ois.readObject( );
            System.out.println("Employee id : "+eData.getEmpID( ));
            System.out.println("Employee name : "+eData.getEmpName( ));
            System.out.println("Employee salary : "+eData.getEmpSalary( ));
            dataSocket.close( );
            connectionSocket.close( );
        }
        catch(Exception e){e.printStackTrace( );}
    }
}
