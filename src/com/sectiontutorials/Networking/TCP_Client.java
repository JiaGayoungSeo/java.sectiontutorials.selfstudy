package com.sectiontutorials.Networking;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class TCP_Client {
    public static void main(String[] args) throws Exception{
        InetAddress ip = InetAddress.getByName ( "172.16.1.92" );
        int port = 12345;
        Socket socket = new Socket ( ip,port ); //요청

        OutputStream output = socket.getOutputStream ();
        PrintWriter pw = new PrintWriter ( new BufferedWriter ( new OutputStreamWriter(output) ) );
        pw.println ( "Hello server" );
        pw.flush ();
        pw.close ();
        socket.close ();
    }
}
