package automotivewarehouse;

public class DisplayAllParts {

    public static void main (String[] args) {

        ExhaustPart exhaustPart = new ExhaustPart(1, "2", 3.5, false);
        Tire tire = new Tire(34, "Black Rider", 4.8, 4.6, 4.3);
        Rim rim = new Rim(11, "321", 65.6, 45.67, 56);

        exhaustPart.printThisPart();
        tire.printThisPart();
        rim.printThisPart();

    }

}
