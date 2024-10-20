package lab3;

public class Bed extends Furniture{
    private int bedLegNum;
    private double bedHeight;
    private double bedWidth;
    private double bedDepth;
    private boolean bedSitDownCheck;
    private double bedPrice;
    private String bedModel;

    public Bed(int bedLegNum, double bedHeight, double bedWidth, double bedDepth, boolean bedSitDownCheck, double bedPrice, String bedModel) {
        super(bedLegNum, bedHeight, bedWidth, bedDepth, bedSitDownCheck, bedPrice, bedModel);
        this.bedLegNum = bedLegNum;
        this.bedHeight = bedHeight;
        this.bedWidth = bedWidth;
        this.bedDepth = bedDepth;
        this.bedSitDownCheck = bedSitDownCheck;
        this.bedPrice = bedPrice;
        this.bedModel = bedModel;
    }

    public void setBedLegNum(int bedLegNum) {
        this.bedLegNum = bedLegNum;
    }

    public void setBedHeight(double bedHeight) {
        this.bedHeight = bedHeight;
    }

    public void setBedWidth(double bedWidth) {
        this.bedWidth = bedWidth;
    }

    public void setBedDepth(double bedDepth) {
        this.bedDepth = bedDepth;
    }

    public void setBedSitDownCheck(boolean bedSitDownCheck) {
        this.bedSitDownCheck = bedSitDownCheck;
    }

    public void setBedPrice(double bedPrice) {
        this.bedPrice = bedPrice;
    }

    public void setBedModel(String bedModel) {
        this.bedModel = bedModel;
    }

    public int getBedLegNum() {
        return bedLegNum;
    }

    public double getBedHeight() {
        return bedHeight;
    }

    public double getBedWidth() {
        return bedWidth;
    }

    public double getBedDepth() {
        return bedDepth;
    }

    public boolean isBedSitDownCheck() {
        return bedSitDownCheck;
    }

    public double getBedPrice() {
        return bedPrice;
    }

    public String getBedModel() {
        return bedModel;
    }

    @Override
    public double calcPrice() {
        return getBedPrice();
    }

    @Override
    public void displayFurnitureInfo() {
        System.out.println("Bed \n\t"
                +"legs number : " + getBedLegNum()
                +"\n\theight : " + getBedHeight()
                +"\n\twidth : " + getBedWidth()
                +"\n\tdepth : " + getBedDepth()
                +"\n\tsit Down : " + isBedSitDownCheck()
                +"\n\tPrice: $" + calcPrice()
                +"\n\tmodel : " + getBedModel());
    }
}
