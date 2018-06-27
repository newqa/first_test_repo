package com.company;

import java.util.Arrays;
import java.util.Scanner;


public class ArraysExcercise {
    public static void main(String[] args) {

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println(name);*/


     /*   int [] arrayFirst = new int[5];
        int arrayOfInts[] = {3, 5, 6};
        System.out.println(Arrays.toString(arrayFirst));
        System.out.println(Arrays.toString(arrayOfInts));

        arrayFirst[0] = 1;
        arrayFirst[1] = 5;

        int firstInt = arrayFirst[0];

        System.out.println(firstInt);

        */
        /*int arrayForI[] = new int[6];

        // wypełnienie tablicy
        for (int i = 0; i<6; i++) {
            arrayForI[i]=i;
        }
        //wydrukowanie elementów
        for(int i:arrayForI) {
        System.out.println(i);
        }*/

      /*for (firstInt:arrayFirst) {
            System.out.println(firstInt);
        }*/
        int[][] tablica = new int[3][];
        tablica[0] = new int[3];
        tablica[1] = new int[2];
        tablica[2] = new int[1];


        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++)
                System.out.print(tablica[i][j]);
            System.out.println();
        }
        int[][] tab = new int[2][3];
        int counter = 0;

        for (int i = 0; i < tab.length; i++)
            for (int j = 0; j < tab[i].length; j++)
                tab[i][j] = counter++;

        System.out.println();
        for (int i = 0; i < tab.length; i++)
            for (int j = 0; j < tab[i].length; j++)
                System.out.printf("tab[%d][%d]=%d \n", i, j, tab[i][j]);

    }

}
