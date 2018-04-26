package com.company;

import java.util.Arrays;
import java.util.Scanner;


public class ArraysExcercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println(name);


     /*   int [] arrayFirst = new int[5];
        int arrayOfInts[] = {3, 5, 6};
        System.out.println(Arrays.toString(arrayFirst));
        System.out.println(Arrays.toString(arrayOfInts));

        arrayFirst[0] = 1;
        arrayFirst[1] = 5;

        int firstInt = arrayFirst[0];

        System.out.println(firstInt);

        */
        int arrayForI[] = new int[6];

        // wypełnienie tablicy
        for (int i = 0; i<6; i++) {
            arrayForI[i]=i+1;
        }
        //wydrukowanie elementów
        for(int i:arrayForI) {
        System.out.println(i);
        }

      /*for (firstInt:arrayFirst) {
            System.out.println(firstInt);
        }*/
    }
}
