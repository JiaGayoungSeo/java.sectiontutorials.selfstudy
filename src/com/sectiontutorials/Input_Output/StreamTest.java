package com.sectiontutorials.Input_Output;

import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamTest {
    public static void main(String[] args) throws Exception{
        /*
        InputStream은 자바의 내장클래스(바이트단위로 읽어들인다)
        System.in 은 InputStream의 객체가 된다
         */
        InputStream in = System.in;

        //InputStreamReader는 문자로 입력스트림을 읽는다.
        //생성자로 InputStream 객체를 받는다.
        InputStreamReader reader = new InputStreamReader ( in );

        int a;
        char[] chars = new char[3];

        //read메소드는 1byte의 사용자의 입력을 받아들인다(사용자의 입력을 받을때까지 대기)
        a = in.read ();
        System.out.println ( a );

        reader.read (chars);
    }
}
