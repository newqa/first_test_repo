package automotivewarehouse;

public class Part {
    private int partId;
    private String model;
    private double productSeries;

    public void setPartId(int partId) {
        this.partId = partId;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProductSeries(double productSeries) {
        this.productSeries = productSeries;
    }

    public Part(int partId, String model, double productSeries) {
        this.partId = partId;
        this.model = model;
        this.productSeries = productSeries;
    }

    public Part() {
    }

    public int getPartId() {
        return partId;
    }

    public String getModel() {
        return model;
    }

    public double getProductSeries() {
        return productSeries;
    }

    public void printThisPart() {
        System.out.println("Id: " + getPartId() + "Product series " + getProductSeries() + "Model" + getModel());
    }

}
