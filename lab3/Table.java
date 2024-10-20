package lab3;

public class Table extends Furniture{
    private int tableLegNum;
    private double tableHeight;
    private double tableWidth;
    private double tableDepth;
    private boolean tableSitDownCheck;
    private double tablePrice;
    private String tableModel;

    public Table(int tableLegNum, double tableHeight, double tableWidth, double tableDepth, boolean tableSitDownCheck, double tablePrice, String tableModel) {
        super(tableLegNum, tableHeight, tableWidth, tableDepth, tableSitDownCheck, tablePrice, tableModel);
        this.tableLegNum = tableLegNum;
        this.tableHeight = tableHeight;
        this.tableWidth = tableWidth;
        this.tableDepth = tableDepth;
        this.tableSitDownCheck = tableSitDownCheck;
        this.tablePrice = tablePrice;
        this.tableModel = tableModel;
    }

    public void setTableLegNum(int tableLegNum) {
        this.tableLegNum = tableLegNum;
    }

    public void setTableHeight(double tableHeight) {
        this.tableHeight = tableHeight;
    }

    public void setTableWidth(double tableWidth) {
        this.tableWidth = tableWidth;
    }

    public void setTableDepth(double tableDepth) {
        this.tableDepth = tableDepth;
    }

    public void setTableSitDownCheck(boolean tableSitDownCheck) {
        this.tableSitDownCheck = tableSitDownCheck;
    }

    public void setTablePrice(double tablePrice) {
        this.tablePrice = tablePrice;
    }

    public void setTableModel(String tableModel) {
        this.tableModel = tableModel;
    }

    public int getTableLegNum() {
        return tableLegNum;
    }

    public double getTableHeight() {
        return tableHeight;
    }

    public double getTableWidth() {
        return tableWidth;
    }

    public double getTableDepth() {
        return tableDepth;
    }

    public boolean isTableSitDownCheck() {
        return tableSitDownCheck;
    }

    public double getTablePrice() {
        return tablePrice;
    }

    public String getTableModel() {
        return tableModel;
    }

    @Override
    public double calcPrice() {
        return getTablePrice();
    }

    @Override
    public void displayFurnitureInfo() {
        System.out.println("Table \n\t"
                +"legs number : " + getTableLegNum()
                +"\n\theight : " + getTableHeight()
                +"\n\twidth : " + getTableWidth()
                +"\n\tdepth : " + getTableDepth()
                +"\n\tsit Down : " + isTableSitDownCheck()
                +"\n\tPrice: $" + calcPrice()
                +"\n\tmodel : " + getTableModel());
    }
}
