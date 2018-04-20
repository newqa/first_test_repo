package com.company.arrays.test;

public class Arrays {

    public static void main(String[] Args) {

        int[] array = new int[3];

        array[0] = 1;
        array[1] = 2;
        array[2] = 4;


        int sumInArray = 0;
        for (int i : array) {
            sumInArray += i;
        }
        System.out.println(sumInArray);
    }
}


