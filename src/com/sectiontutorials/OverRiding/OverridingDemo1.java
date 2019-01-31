package com.sectiontutorials.OverRiding;

class Animal{
    public String Info(){
        return "나는 동물이야";
    }
}

class Dog extends Animal{
    public String Info(){
        return "나는 강아지야";
    }
}

class Cat extends Animal{
    public String Info(){
        return "나는 고양이야";
    }
}

public class OverridingDemo1 {
    Cat myCat = new Cat();

}
