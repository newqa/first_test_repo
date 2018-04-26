package com.company.calculator_with_input;
import java.util.Scanner;

public class Calculator {

    public static final String plusSign = "+";
    public static final String minusSign = "-";
    public static final String divideSign = "/";
    public static final String multiplySign = "*";

    public static void main(String[] args) {

        Calculate calculate = new Calculate();

        Scanner scanner = new Scanner(System.in);

        float a;
        float b;
        String operationInput;

        System.out.println("Podaj pierwszą liczbę zmiennoprzecinkową ");
        a = scanner.nextFloat();
        System.out.println("Podana liczba " + a);

        System.out.println("Wybierz typ działania matematycznego (+, -, *, / )");

        Scanner scannerForOperation = new Scanner(System.in);
        operationInput = scannerForOperation.nextLine();

        System.out.println("Podaj drugą liczbę zmiennoprzecinkową ");
        b = scanner.nextFloat();
        System.out.println("Podana liczba " + b);

        switch (operationInput) {
            case plusSign:
                System.out.println("Wynik dodawania: " + calculate.add(a,b));
                break;
            case minusSign:
                System.out.println("Wynik odejmowania :: " + calculate.subtract(a,b));
                break;
            case divideSign:
                System.out.println("Wynik dzielenia :: " + calculate.divide(a,b));
                break;
            case multiplySign:
                System.out.println("Wynik mnożenia :: " + calculate.multiply(a,b));
                break;
            default:
                System.out.println("Wybierz poprawny symbol operacji :(");
                break;
        }

    }

}