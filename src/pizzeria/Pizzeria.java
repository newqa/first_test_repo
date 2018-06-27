package pizzeria;

import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {

        System.out.println("Ingredients: ");
        for (Pizza s : Pizza.values()) {
            System.out.println(s);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a pizza: MARGHERITA, CAPRICIOSA, PROSCIUTTO");
        Pizza pizza = Pizza.valueOf(scanner.nextLine());

        System.out.println("We are preparing" + pizza.name() + "for you");
        scanner.close();
    }
}