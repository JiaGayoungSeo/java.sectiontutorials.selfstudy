package com.sectiontutorials.Mathclass;

public class Mathclass {
    public static void main(String[] args){

        int numOfApples = 123;
        int sizeOfBucket = 10;
        int numberOfBucket = (int)Math.ceil((double)numOfApples/sizeOfBucket);
        System.out.println("올림"+numberOfBucket);

        int numberOfBucket2 = (int)Math.round((double)numOfApples/sizeOfBucket);
        System.out.println("반올림"+numberOfBucket2);
    }
}
