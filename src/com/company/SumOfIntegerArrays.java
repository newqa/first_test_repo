package com.company;

public class SumOfIntegerArrays {

    public static void main(String[] Args) {

        int[] firstArrayOfInts = {6, 1, 5};
        int[] secondArrayOfInts = new int[3];

        secondArrayOfInts[0] = 3;
        secondArrayOfInts[1] = 4;
        secondArrayOfInts[2] = 1;

        int sumInFirstArray = getSumInArray(firstArrayOfInts);

        int sumInSecondArray = getSumInArray(secondArrayOfInts);

        System.out.println(sumInFirstArray + sumInSecondArray);

    }

    private static int getSumInArray(int[] ArrayOfInts) {
        int sumInArray = 0;
        for (int i : ArrayOfInts) {
            sumInArray += i;
        }
        return sumInArray;
    }


}