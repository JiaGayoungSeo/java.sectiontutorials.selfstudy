package com.sectiontutorials.Inheritance;

public class BusinessMan extends Man {
    //인스턴스 변수 company, position
    String company;
    String position;


    public BusinessMan(String name, String company, String position){
        //부모 클래스의 인스턴스 변수인 name을 초기화 시킨다.(그래서 좋은 코드는 아님)
        this.name = name;

        this.company = company;
        this.position = position;
    }

    public void tellYourInfo(){
        System.out.println ( "My company is "+ company );
        System.out.println ( "My position is "+ position );
    }
}
