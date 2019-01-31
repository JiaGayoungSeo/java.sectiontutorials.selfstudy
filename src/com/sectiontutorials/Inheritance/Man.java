package com.sectiontutorials.Inheritance;

public class Man {

    //인스턴스 변수
    String name;

    //Constructor 클래스 안에 있는 인스턴스 변수(name)을 초기화 하느게 목적
    public Man(String name){
        this.name = name;
    }

    public Man(){

    }

    public void tellYourName(){
        System.out.println ( "My name is "+ name );
    }
}


