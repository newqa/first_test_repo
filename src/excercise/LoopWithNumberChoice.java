package excercise;

import java.util.Scanner;

public class LoopWithNumberChoice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scannerForValues = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int numberChoice = scanner.nextInt();

        int counter = 0;
        int sum = 0;
        do {
            System.out.println("Choose a value:");
            sum+=scannerForValues.nextInt();
            counter++;
        }
        while (counter < numberChoice);
        System.out.println(sum);
    }
}
