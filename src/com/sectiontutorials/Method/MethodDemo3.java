package com.sectiontutorials.Method;

public class MethodDemo3 {

    public static void add(int a, int b){
        System.out.println(a+b);
    }

    public static int add2(int a, int b){
        return a-b;
    }

    public static void main(String[] args){
        add(800,500);
        add(100, 890);
        System.out.println(add2(90,800));
    }

}
