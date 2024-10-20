package lab7;

public class CustomerPurchaseRecords implements Comparable<CustomerPurchaseRecords>{

    String customerName;
    String productName;
    int productNumber;

    public CustomerPurchaseRecords(String customerName, String productName, int productNumber) {
        this.customerName = customerName;
        this.productName = productName;
        this.productNumber = productNumber;
    }


    @Override
    public int compareTo(CustomerPurchaseRecords o) {
        if(!productName.equals(o.productName)){
            return productName.compareTo(o.productName);
        }
        return Integer.compare(productNumber,o.productNumber);
    }

    @Override
    public String toString() {
        return "CustomerPurchaseRecords{" +
                "customerName='" + customerName + '\'' +
                ", productName='" + productName + '\'' +
                ", productNumber=" + productNumber +
                '}'+"\n";
    }
}
