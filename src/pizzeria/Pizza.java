package pizzeria;

public enum Pizza {

    MARGHERITTA("tomato sauce", "cheese"),
    CAPRICIOSA("tomato sauce", "cheese", "mushrooms"),
    PROSCIUTTO("tomato sauce", "cheese", "ham");

    private Pizza pizza;

    private String sauce;
    private String cheese;
    private String topping;


    Pizza(String sauce, String cheese, String topping) {
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

    Pizza(String sauce, String cheese) {
        this.sauce = sauce;
        this.cheese = cheese;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public String getSauce() {
        return sauce;
    }

    public String getCheese() {
        return cheese;
    }

    public String getTopping() {
        return topping;
    }

    @Override
    public String toString() {
        String yourPizza = this.name();
        return yourPizza
                +
                " sauce " + sauce + '\'' +
                ", cheese '" + cheese + '\'' +
                ", topping '" + topping + '\'' +
                '}';
    }
}
