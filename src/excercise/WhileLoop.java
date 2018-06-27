package excercise;

public class WhileLoop {

    public static void main(String[] args) {
        int counter = 0;
        while (counter < 10) {
            System.out.println("Enter loop");
            System.out.println("Counter value is " + counter);
            System.out.println("Condition is " + Boolean.valueOf(counter < 10));
            counter++;    }
    }
}
