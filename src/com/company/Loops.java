package com.company;

public class Loops {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Uneven number in loop: " + i);
        }

        for (int j = 0; j < 5; j++) {
            if (j == 3) {
                break;
            }
            System.out.println(j);
        }

    }
}


