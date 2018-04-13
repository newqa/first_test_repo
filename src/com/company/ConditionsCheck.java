package com.company;

import java.util.Scanner;

public class ConditionsCheck {
    public static void main(String[] args) {

        int a;
        int b;
        Scanner intInput = new Scanner(System.in);
        System.out.println("Podaj liczby ");
        a = intInput.nextInt();
        b = intInput.nextInt();

        if (a == b) {
            System.out.println("Liczby są równe");
        } else {
            System.out.println("Liczny są różne");
        }
    }
}