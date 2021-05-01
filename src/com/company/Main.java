package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Podaj imie ");
        String name;
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        System.out.println("Cześć " + name +"!");
    }
}
