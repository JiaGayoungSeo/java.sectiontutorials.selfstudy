package com.sectiontutorials.Generic;

//code when generic didn't exist
public class PreviousFruitBox {
    static class Apple{
        public String toString(){
            return "I am an apple";
        }
    }

    static class Orange{
        public String toString() {
            return "I am an orange";
        }
    }

    //can store both apples and oranges
    static class Box{
        private Object object;

        public void setObject(Object object){
            this.object = object;
        }

        public Object getObject(){
            return object;
        }
    }

    public static void main(String[] args){
        Box appleBox = new Box (); // 상자 생성
        Box orangeBox = new Box (); // 상자 생성

        appleBox.setObject ( new Apple () ); // 상자에 사과를 담는다
        orangeBox.setObject ( new Orange () ); // 상자에 오렌지를 담는다

        //명시적 형변환을 해줘야한다 -> 위험이 높아진다/코드의 안전성 떨어진다/*컴파일러의 오류 발견 가능성을 낮추는 결과르 이어진다.
        Apple apple = (Apple)appleBox.getObject (); // 상자에 담은 사과를 꺼낸다.
        Orange orange = (Orange)orangeBox.getObject (); // 상자에 담은 오렌지를 꺼낸다.

        System.out.println ( apple );
        System.out.println ( orange );
    }
}
