package com.company.twoDimensionalArray;

public class ArrayNumbers {

    public static void main(String[] args) {

        double[][] tab = new double[3][];
        double[] line0 = {1.0, 1.5, 2.0};
        double[] line1 = {1.5, 2.0, 2.5};
        double[] line2 = {2.0, 2.5, 3.0};

        tab[0] = line0;
        tab[1] = line1;
        tab[2] = line2;

        double result = (tab[0][0] * tab[1][1] * tab[2][2]) + (tab[0][2] * tab[1][1] * tab[2][0]);

        double result1 = (tab[0][1] + tab[1][1] + tab[2][1]) * (tab[1][0] + tab[1][1] + tab[1][2]);

        double result2 = tab[0][0] + tab[0][1] + tab[0][2] + tab[1][0] + tab[1][2] + tab[2][0] + tab[2][1] + tab[2][2];

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
}


