package com.sectiontutorials.Input_Output;
import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int intValue = sc.nextInt();
        long longValue = sc.nextLong();
        double doubleValue = sc.nextDouble();
        String strValue = sc.next();
        boolean boolValue = sc.nextBoolean();
    }
}
