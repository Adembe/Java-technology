package Ywts2;

public class Car {
    private String model;
    private Integer productionYear;
    private String company;

    public Car(String model, Integer productionYear, String company) {
        this.model = model;
        this.productionYear = productionYear;
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
