package com.company.Calculator;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return add(a, b) + c;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public double add(double a, double b, double c, int d) {
        return a + b + c + d;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double subtract(double a, double b, double c) {
        return a - b - c;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b, double c) {
        return a * b * c;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double divide(double a, double b, int c) {
        return a / b / c;
    }
}



