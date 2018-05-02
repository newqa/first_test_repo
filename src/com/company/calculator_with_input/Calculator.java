package com.company.calculator_with_input;

import java.util.Scanner;


public class Calculator {

    private static final String ADD_OPERATION = "+";
    private static final String SUBTRACT_OPERATION = "-";
    private static final String DIVIDE_OPERATON = "/";
    private static final String MULTIPLY_OPERATION = "*";

    public static void main(String[] args) {

        Calculate calculate = new Calculate();
        Scanner scanner = new Scanner(System.in);
        Scanner scannerForOperation = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę zmiennoprzecinkową ");
        float firstNumber = scanner.nextFloat();
        System.out.println("Podana liczba " + firstNumber + "\n");
        System.out.println("Wybierz typ działania matematycznego (+, -, *, / )");

        String operationInput = scannerForOperation.nextLine();
        System.out.println("\n" + "Podaj drugą liczbę zmiennoprzecinkową ");

        float secondNumber = scanner.nextFloat();
        System.out.println("Podana liczba " + secondNumber);

        switch (operationInput) {
            case ADD_OPERATION:
                System.out.println("Wynik dodawania: " + String.format("%.02f", calculate.add(firstNumber, secondNumber)));
                break;
            case SUBTRACT_OPERATION:
                System.out.println("Wynik odejmowania :: " + String.format("%.02f", calculate.subtract(firstNumber, secondNumber)));
                break;
            case DIVIDE_OPERATON:
                System.out.println("Wynik dzielenia :: " + String.format("%.02f", calculate.divide(firstNumber, secondNumber)));
                break;
                //String formattedString = ("%.02f", myFloat);
            case MULTIPLY_OPERATION:
                System.out.println("Wynik mnożenia :: " + String.format("%.02f", calculate.multiply(firstNumber, secondNumber)));
                break;
            default:
                System.out.println("Wybierz poprawny symbol operacji :(");
                break;
        }

    }

}