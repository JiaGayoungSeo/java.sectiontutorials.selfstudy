package com.sectiontutorials.Method;

public class MethodDemo1 {
    //public 리턴타입 메소드명(매개변수들) {구현}

    //리턴타입이 없는 경우(void를 적어준다) & 매개변수가 없는경우
    public void method1(){
        System.out.println("method1이 실행됩니다");
    }

    //정수를 매개변수로 받고 리턴하지 않는 메소드
    public void method2(int x){
        System.out.println(x + "를 이용하는 method2입니다");
    }

    //아무것도 받아들이지 않고, 정수를 반환하는 메소드
    public int method3(){
        System.out.println("method3이 실행됩니다");
        return 10;
    }

    //정수 2개를 매개변수로 받고 아우것도 반환하지 않는 메소드
    public void method4(int a, int b){
        System.out.println(a+","+b+" 를 이용하는 method4입니다");
    }

    //정수를 1개 받아들인 후 정수를 반환하는 메소드
    public int method5(int a){
        System.out.println(a + " 를 이용하는 method5입니다");
        return a*2;
    }


}
