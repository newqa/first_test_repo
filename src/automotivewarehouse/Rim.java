package automotivewarehouse;

public class Rim extends Part {
    private double size;
    private double width;

    public double getSize() {
        return size;
    }

    public double getWidth() {
        return width;
    }

    public Rim(int partId, String model, double productSeries, double size, double width) {
        super(partId, model, productSeries);
        this.size = size;
        this.width = width;
    }

    public void printThisPart() {
        System.out.println("RIM's parameters:" + "\n" + "Id: " + getPartId() + "\n" + "Product series " + getProductSeries() + "\n" + "Model " + getModel() + "\n" + "Size " + getSize() + "\n" + "Width " + getWidth());
        System.out.println();
    }
}

