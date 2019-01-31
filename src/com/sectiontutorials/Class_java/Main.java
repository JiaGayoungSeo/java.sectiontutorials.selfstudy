package com.sectiontutorials.Class_java;

public class Main {
    public static void main(String[] args){

        Node one = new Node(10,20);
        Node two = new Node(30,40);
        Node result = one.getCenter(two);
        System.out.println(result.getX());
        System.out.print(result.getY());
    }
}
