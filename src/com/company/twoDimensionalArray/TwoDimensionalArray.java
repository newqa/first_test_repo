package com.company.twoDimensionalArray;


public class TwoDimensionalArray {

    public static void main(String[] Args) {

        double[][] arrayOfDoubles = new double[3][3];

        arrayOfDoubles[0][0] = 1.0;
        arrayOfDoubles[1][0] = 1.5;
        arrayOfDoubles[2][0] = 2.0;
        arrayOfDoubles[0][1] = 1.5;
        arrayOfDoubles[1][1] = 2.0;
        arrayOfDoubles[2][1] = 2.5;
        arrayOfDoubles[0][2] = 2.0;
        arrayOfDoubles[1][2] = 2.5;
        arrayOfDoubles[2][2] = 3.0;

        double firstValue = arrayOfDoubles[0][0];
        double fifthValue = arrayOfDoubles[1][1];
        double ninthValue = arrayOfDoubles[2][2];
        System.out.println("Sum of values in first diagonal: " + (firstValue + fifthValue + ninthValue));

        double thirdValue = arrayOfDoubles[2][0];
        double seventhValue = arrayOfDoubles[0][2];
        System.out.println("Sum of values in second diagonal: " + (thirdValue + fifthValue + seventhValue));

        double secondValue = arrayOfDoubles[1][0];
        double eighthValue = arrayOfDoubles[1][2];
        System.out.println("Multiplication of values in middle row: " + (secondValue * fifthValue * eighthValue));

        double fourthValue = arrayOfDoubles[0][1];
        double sixthValue = arrayOfDoubles[2][1];
        System.out.println("Multiplication of values in middle column: " + (fourthValue * fifthValue * sixthValue));

        System.out.println("Sum of all edge values: " + (fifthValue + secondValue + thirdValue + fourthValue + sixthValue + seventhValue + eighthValue + ninthValue));
    }
}