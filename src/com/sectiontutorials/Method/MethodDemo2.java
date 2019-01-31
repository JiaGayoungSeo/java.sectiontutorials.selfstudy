package com.sectiontutorials.Method;

public class MethodDemo2 {

    public static void main(String[] args){
        MethodDemo1 test = new MethodDemo1();
        test.method1();
        test.method2(6);
        int value = test.method3();
        System.out.println("method3이 리턴한 값 "+value);
        test.method4(10,6);
        int value2 = test.method5(7);
        System.out.println("method5를 이용한 " + value2);
    }
}
