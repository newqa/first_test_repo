package com.company.calculator_with_input;

import java.util.Scanner;

public class Calculator {

    private static final String PLUS_SIGN = "+";
    private static final String MINUS_SIGN = "-";
    private static final String DIVIDE_SIGN = "/";
    private static final String MULTIPLY_SIGN = "*";

    public static void main(String[] args) {

        Calculate calculate = new Calculate();

        Scanner scanner = new Scanner(System.in);

        float a;
        float b;
        String operationInput;

        System.out.println("Podaj pierwszą liczbę zmiennoprzecinkową ");
        a = scanner.nextFloat();
        System.out.println("Podana liczba " + a + "\n");

        System.out.println("Wybierz typ działania matematycznego (+, -, *, / )");

        Scanner scannerForOperation = new Scanner(System.in);
        operationInput = scannerForOperation.nextLine();

        System.out.println("\n" + "Podaj drugą liczbę zmiennoprzecinkową ");
        b = scanner.nextFloat();
        System.out.println("Podana liczba " + b);

        switch (operationInput) {
            case PLUS_SIGN:
                System.out.println("Wynik dodawania: " + calculate.add(a, b));
                break;
            case MINUS_SIGN:
                System.out.println("Wynik odejmowania :: " + calculate.subtract(a, b));
                break;
            case DIVIDE_SIGN:
                System.out.println("Wynik dzielenia :: " + calculate.divide(a, b));
                break;
            case MULTIPLY_SIGN:
                System.out.println("Wynik mnożenia :: " + calculate.multiply(a, b));
                break;
            default:
                System.out.println("Wybierz poprawny symbol operacji :(");
                break;
        }

    }

}