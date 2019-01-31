package com.sectiontutorials.OverLoading;

class Add{
    //메소드 만들기
    public int sum(int a, int b){
        return  a+b;
    }

    //같은 이름의 메소드 만들기 단 매개변수 유형은 다르게
    public double sum(double a, double b){
        return a+b;
    }
}

public class OverloadingDemo1 {
    public static void main(String[] args){
        Add myAdd = new Add();
        System.out.println(myAdd.sum(23,35));
        System.out.println(myAdd.sum(24.7777,56.909));
    }


}
