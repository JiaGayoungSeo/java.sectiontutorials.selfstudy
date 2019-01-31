package com.sectiontutorials.Arrays;

import java.util.Arrays;

public class ArraysDemo4_sort {
    public static void main(String[] args) {
        int[] array = {12, 34, 45,1,4};
        Arrays.sort(array);
        for(int i =0; i<array.length;i++){
            System.out.println(array[i]);
        }
    }


}


