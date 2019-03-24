package com.sectiontutorials.Networking;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo2 {
/*
프로그래밍 순서(클라이언트)
1.서버의 ip주소와 서버가 정한 port번호를 매개변수로 하여 클라이언트용 소켓 객체를 생성한다.
2.서버와의 입출력 스트림을 오픈한다.
3.보조스트림을 붙여 성능을 개선한다.
4.스트림을 통해 읽고 쓰기를 한다.
5.통신을 종료한다.
 */

    public static void main(String[] args){

        int port = 90;

        //서버와 데이터 입출력을 위한 스트림 생성
        BufferedReader br = null;
        PrintWriter pw = null;
        //클라이언트용 소켓 객체 생성
        Socket socket = null;

        try{
            System.out.println ( InetAddress.getLocalHost ().getHostAddress () );
            String serverIp = "172.16.1.92";

            //서버 연결 소켓
            socket = new Socket ( serverIp,port );

            if(socket!=null)//소켓 객체가 생성되었다면
            {
                //입출력 스트림 생성(데이터를 가져오고 보낼수 있도록)
                InputStream input = socket.getInputStream ();
                OutputStream output = socket.getOutputStream ();
                //보조 스트림 붙이기(성능개선)
                br = new BufferedReader ( new InputStreamReader ( input ) );
                pw = new PrintWriter ( output );

                //Scanner 생성
                Scanner sc = new Scanner ( System.in );

                do{
                    System.out.print( "Message:" );
                    String message = sc.nextLine ();

                    while(!message.equals ( "true" )){
                        //client가 입력한 메세지를 서버에 보냄
                        pw.println (message);
                        //버퍼 비워주기
                        pw.flush ();
                    }

                    //서버가 보낸 메세지 확인
                    String receiveMessage = br.readLine ();
                    System.out.println ( receiveMessage );

                    if(message.equals ( "exit" )){
                        break;
                    }
                } while(true);
            }
        } catch (IOException e){
            e.printStackTrace ();
        }
        finally {
            try{
                br.close ();
                pw.close ();
                socket.close ();
            }catch (Exception e){

            }
        }


    }
}
