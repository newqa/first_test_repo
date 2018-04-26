package com.company;

public class SumOfIntegerArrays {

    public static void main(String[] Args) {

        int[] firstArrayOfInts = {6, 1, 5};
        int[] secondArrayOfInts = new int[3];

        secondArrayOfInts[0] = 3;
        secondArrayOfInts[1] = 4;
        secondArrayOfInts[2] = 1;

        int sumInFirstArray = 0;
        for (int i:firstArrayOfInts)
        {
            sumInFirstArray +=i;
        }

        int sumInSecondArray = 0;
        for (int i:secondArrayOfInts)
        {
            sumInSecondArray +=i;
        }

        System.out.println(sumInFirstArray+sumInSecondArray);
        }
    }
