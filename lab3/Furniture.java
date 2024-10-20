package lab3;

abstract class Furniture {
    private int lNum;
    private double hei;
    private double wid;
    private double dep;
    private boolean sitDownCheck;
    private double pri;
    private String model;

    public void setlNum(int lNum) {
        this.lNum = lNum;
    }

    public void setHei(double hei) {
        this.hei = hei;
    }

    public void setWid(double wid) {
        this.wid = wid;
    }

    public void setDep(double dep) {
        this.dep = dep;
    }

    public void setSitDownCheck(boolean sitDownCheck) {
        this.sitDownCheck = sitDownCheck;
    }

    public void setPri(double pri) {
        this.pri = pri;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getlNum() {
        return lNum;
    }

    public double getHei() {
        return hei;
    }

    public double getWid() {
        return wid;
    }

    public double getDep() {
        return dep;
    }

    public boolean isSitDownCheck() {
        return sitDownCheck;
    }

    public double getPri() {
        return pri;
    }

    public String getModel() {
        return model;
    }

    public Furniture(int lNum, double hei, double wid, double dep, boolean sitDownCheck, double pri, String model) {
        this.lNum = lNum;
        this.hei = hei;
        this.wid = wid;
        this.dep = dep;
        this.sitDownCheck = sitDownCheck;
        this.pri = pri;
        this.model = model;
    }

    public abstract double calcPrice();

    public abstract void displayFurnitureInfo();
}
