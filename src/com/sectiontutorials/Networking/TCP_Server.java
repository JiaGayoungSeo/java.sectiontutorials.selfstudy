package com.sectiontutorials.Networking;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_Server {
    public static void main(String[] args) throws Exception{
        int port = 12345;
        ServerSocket server = new ServerSocket ( port );
        System.out.println ( "Server ready! " ); //사버소켓이 생성되면 서버 준비 된 상태
        Socket socket = server.accept ();//
        InputStream input = socket.getInputStream ();
        BufferedReader br = new BufferedReader ( new InputStreamReader ( input ) );
        String data = br.readLine ();
        System.out.println ( "Client says "+data );
        br.close ();
        socket.close ();
        server.close ();
    }
}
