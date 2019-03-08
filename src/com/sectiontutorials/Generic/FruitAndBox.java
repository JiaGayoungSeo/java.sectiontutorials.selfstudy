package com.sectiontutorials.Generic;

//Generic -> template in C++ 자료형을 결정 짓지 않고 틀을 만든다.

public class FruitAndBox {
    class Apple{
        public String toString(){
            return "I am an apple";
        }
    }

    class Orange{
        public String toString() {
            return "I am an orange";
        }
    }

    class AppleBox{
        private Apple ap;

        public void set(Apple a){
            ap = a;
        }
    }


}
