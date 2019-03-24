package com.sectiontutorials.Networking;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
프로그래밍 순서(서버용)
1.서버의 포트번호를 정한다.
2.서버용 소켓 객체를 생성한다.
3.클라이언트쪽에서 접속 요청이 오기를 기다린다.
4.접속 요청이 들어오면 요청을 수락하고 해당 클라이언트에 대한 소켓 객체를 생성한다.
5.연결된 클라이언트와 입출력 스트림을 생성한다.
6.보조스트림을 통해 성능을 개선시킨다.
7.스트림을 통해 읽고 쓰기를 한다.
8.통신을 종료한다.
 */
public class ServerDemo1 {

    public static void main(String[] args) throws IOException{

        int port = 9999;
        //create ServerSocket.
        ServerSocket server = new ServerSocket ( port );

        while(true){
            //server 소켓으로 들어오는 클라이언트 소켓을 받음
            Socket client = server.accept ();

            //데이터를 가져오고 보낼 스트림을 연결
            InputStream input = client.getInputStream ();
            OutputStream output = client.getOutputStream ();

            //문자통신만 하기 때문에 그리고 속도 향상을 위해 보조스트림연결

            BufferedReader br = new BufferedReader ( new InputStreamReader ( input ) );
            PrintWriter pw = new PrintWriter ( output );

            //메세지를 보내고 받는 기능 구현하기
            while(true){
                //클라이언트가 보낸 메세지를 받음
                String message = br.readLine ();

                Scanner sc = new Scanner ( System.in );

                if(!message.equals ( "exit" )){
                    System.out.println ( client.getInetAddress ()+"가 보낸 메세지"+message );
                    String newMessage = sc.nextLine ();
                    pw.println (newMessage);
                    //버퍼 비워주기
                    pw.flush ();
                } else{
                    System.out.println ( "접속종료" );
                    break;
                }

            }
            br.close ();//스트림 닫기
            pw.close ();//스트림 닫기
            client.close ();//소켓 닫기
        }
    }
}
