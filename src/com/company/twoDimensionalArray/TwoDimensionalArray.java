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
        double thirdValue = arrayOfDoubles[2][0];
        double fifthValue = arrayOfDoubles[1][1];
        double seventhValue = arrayOfDoubles[0][2];
        double ninthValue = arrayOfDoubles[2][2];
        double result = (firstValue * fifthValue * ninthValue) + (thirdValue * fifthValue * seventhValue);
        System.out.println("Sum of diagonal products: " + result);

        double secondValue = arrayOfDoubles[1][0];
        double eighthValue = arrayOfDoubles[1][2];
        double fourthValue = arrayOfDoubles[0][1];
        double sixthValue = arrayOfDoubles[2][1];
        double result1 = (secondValue + fifthValue + eighthValue) * (fourthValue + fifthValue + sixthValue);
        System.out.println("Multiplication of values in middle row and middle column: " + result1);


        double result2 = (firstValue+ secondValue + thirdValue + fourthValue + sixthValue + seventhValue + eighthValue + ninthValue);
        System.out.println("Sum of all edge values: " + result2);
    }
}