package com.company.calculator_with_input;

import java.util.Scanner;
import java.text.*;


public class Calculator {

    private static final String ADD_OPERATION = "+";
    private static final String SUBTRACT_OPERATION = "-";
    private static final String DIVIDE_OPERATON = "/";
    private static final String MULTIPLY_OPERATION = "*";

    public static void roundFloat (float result){
        DecimalFormat myFormatter = new DecimalFormat("##.####");
        String output = myFormatter.format(result);
        System.out.println(output);
    }

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
                float addingResult = calculate.add(firstNumber, secondNumber);
                roundFloat(addingResult);
                break;
            case SUBTRACT_OPERATION:
                float substractionResult = (calculate.subtract(firstNumber, secondNumber));
                roundFloat(substractionResult);
                break;
            case DIVIDE_OPERATON:
                float divisionResult = (calculate.divide(firstNumber, secondNumber));
                roundFloat(divisionResult);
                break;
            case MULTIPLY_OPERATION:
                float multiplicationResult = (calculate.multiply(firstNumber, secondNumber));
                roundFloat(multiplicationResult);
                break;
            default:
                System.out.println("Wybierz poprawny symbol operacji :(");
                break;
        }

    }

}