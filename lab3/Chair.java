package lab3;

public class Chair extends Furniture{
    private int chairLegNum;
    private double chairHeight;
    private double chairWidth;
    private double chairDepth;
    private boolean chairSitDownCheck;
    private double chairPrice;
    private String chairModel;

    public Chair(int chairLegNum, double chairHeight, double chairWidth, double chairDepth, boolean chairSitDownCheck, double chairPrice, String chairModel) {
        super(chairLegNum,chairHeight,chairWidth,chairDepth,chairSitDownCheck,chairPrice,chairModel);
        this.chairLegNum = chairLegNum;
        this.chairHeight = chairHeight;
        this.chairWidth = chairWidth;
        this.chairDepth = chairDepth;
        this.chairSitDownCheck = chairSitDownCheck;
        this.chairPrice = chairPrice;
        this.chairModel = chairModel;
    }

    public void setChairLegNum(int chairLegNum) {
        this.chairLegNum = chairLegNum;
    }

    public void setChairHeight(double chairHeight) {
        this.chairHeight = chairHeight;
    }

    public void setChairWidth(double chairWidth) {
        this.chairWidth = chairWidth;
    }

    public void setChairDepth(double chairDepth) {
        this.chairDepth = chairDepth;
    }

    public void setChairSitDownCheck(boolean chairSitDownCheck) {
        this.chairSitDownCheck = chairSitDownCheck;
    }

    public void setChairPrice(double chairPrice) {
        this.chairPrice = chairPrice;
    }

    public void setChairModel(String chairModel) {
        this.chairModel = chairModel;
    }

    public int getChairLegNum() {
        return chairLegNum;
    }

    public double getChairHeight() {
        return chairHeight;
    }

    public double getChairWidth() {
        return chairWidth;
    }

    public double getChairDepth() {
        return chairDepth;
    }

    public boolean isChairSitDownCheck() {
        return chairSitDownCheck;
    }

    public double getChairPrice() {
        return chairPrice;
    }

    public String getChairModel() {
        return chairModel;
    }

    @Override
    public double calcPrice() {
        return getChairPrice();
    }

    @Override
    public void displayFurnitureInfo() {
        System.out.println("Chair \n\t"
                +"legs number : " + getChairLegNum()
                +"\n\theight : " + getChairHeight()
                +"\n\twidth : " + getChairWidth()
                +"\n\tdepth : " + getChairDepth()
                +"\n\tsit Down : " + isChairSitDownCheck()
                +"\n\tPrice: $" + calcPrice()
                +"\n\tmodel : " + getChairModel());
    }
}
