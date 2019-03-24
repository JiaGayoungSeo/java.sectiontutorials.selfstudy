package com.sectiontutorials.Input_Output;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BufferedReaderTest {
    public static void main(String[] args) throws Exception{
        //BufferedReader 객체생성
        //new InputStreamReader 및 System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //StringTokenizer 객체선언
        StringTokenizer st = null;

        //String Line 이므로 Integer.parseInt를 이용하여 형변환해야함
        int n = Integer.parseInt(br.readLine());

        //"1 3 5 7" 식으로 공란 포함 String Line일시 StringTokenizer 이용
        int[] arrays = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            arrays[i] = Integer.parseInt(st.nextToken());
        }
    }

}
