package com.sectiontutorials.OverRiding;

class Car{
    public void run() {
        System.out.println("Car의 run 메소드");
    }
}

class Bus extends Car{
    public void run(){
        super.run();
        System.out.println("Bus의 run 메소드");

    }

}

public class OverridingDemo2 {
    public static void main(String[] args){
        Bus bus = new Bus();
        bus.run();
    }
}
