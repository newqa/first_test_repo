package automotivewarehouse;

public class Tire extends Part {

    private double size;
    private double width;

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSize() {
        return size;
    }

    public double getWidth() {
        return width;
    }

    public Tire(int partId, String model, double productSeries, double size, double width) {
        super(partId, model, productSeries);
        this.size = size;
        this.width = width;
    }

    public Tire() {
    }

    public void printThisPart() {
        System.out.println("TIRE's parameters:" + "\n" + "Id: " + getPartId() + "\n" + "Product series " + getProductSeries() + "\n" + "Model " + getModel() + "\n" + "Size " + getSize() + "\n" + "Width " + getWidth());
        System.out.println();
    }
}
