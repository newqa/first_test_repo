package grocerystore;

public class Apple extends Fruit {

    public String variant;

    public Apple (String variant) {
        this.variant = variant;
    }

    public void printInfo() {
        System.out.println(productCategory + this.getClass().getSimpleName() + variant);
    }

}
