package com.company.calculator;

public class CalcTest {

    public static void main(String[] args) {

        Calculator calcTest = new Calculator();

        System.out.println(calcTest.add(1, 2));
        System.out.println(calcTest.add(3543451, 2343, 354));
        System.out.println(calcTest.add(451.7, 2343.4, 3.6, 45));
        System.out.println(calcTest.subtract(3, 78));
        System.out.println(calcTest.subtract(3, 4, 29));
        System.out.println(calcTest.multiply(2, 75));
        System.out.println(calcTest.multiply(2, 3, 3));
        System.out.println(calcTest.divide(5.5, 6.6, 7));
        System.out.println(calcTest.divide(5.5, 6.6));
    }

}

