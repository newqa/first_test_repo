package automotivewarehouse;

public class ExhaustPart extends Part {

    public boolean compliesWithEmissionStandard;

    public ExhaustPart(int partId, String model, double productSeries, boolean compliesWithEmissionStandard) {
        super.setPartId(partId);
        super.setModel(model);
        super.setProductSeries(productSeries);
        this.compliesWithEmissionStandard = compliesWithEmissionStandard;
    }

    public ExhaustPart(boolean compliesWithEmissionStandard) {
        this.compliesWithEmissionStandard = compliesWithEmissionStandard;
    }

    public void setCompliesWithEmissionStandard(boolean compliesWithEmissionStandard) {
        this.compliesWithEmissionStandard = compliesWithEmissionStandard;
    }

    public boolean isCompliesWithEmissionStandard() {
        return compliesWithEmissionStandard;
    }

    public void printThisPart() {
       System.out.println("EXHAUST PART parameters" + "\n" + "Id: " + getPartId() + "\n" +"Product series " + getProductSeries() + "\n" +"Model " + getModel() + "\n" + "Complies with EU standard " + isCompliesWithEmissionStandard());
       System.out.println();
    }

}
