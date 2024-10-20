package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductNameAndNumberSorted {
    List<CustomerPurchaseRecords> customerPurchaseRecords = new ArrayList<>();
    public ProductNameAndNumberSorted() {
        CustomerPurchaseRecords customer1 = new CustomerPurchaseRecords("Bat", "aaa", 1);
        CustomerPurchaseRecords customer2 = new CustomerPurchaseRecords("Pvrev", "aaa", 2);
        CustomerPurchaseRecords customer3 = new CustomerPurchaseRecords("Svren", "aaa", 3);
        CustomerPurchaseRecords customer4 = new CustomerPurchaseRecords("Bat", "aaa", 6);
        CustomerPurchaseRecords customer5 = new CustomerPurchaseRecords("Pvrew", "aaa", 7);
        CustomerPurchaseRecords customer6 = new CustomerPurchaseRecords("Svren", "aaa", 8);
        CustomerPurchaseRecords customer7 = new CustomerPurchaseRecords("Bat", "bbb", 3);
        CustomerPurchaseRecords customer8 = new CustomerPurchaseRecords("Pvrew", "bbb", 7);
        CustomerPurchaseRecords customer9 = new CustomerPurchaseRecords("Svren", "aaa", 345);
        CustomerPurchaseRecords customer10 = new CustomerPurchaseRecords("Bat", "ccc", 45);
        CustomerPurchaseRecords customer11 = new CustomerPurchaseRecords("Pvrew", "ddd", 34);
        CustomerPurchaseRecords customer12 = new CustomerPurchaseRecords("Zana", "eee", 234);
        CustomerPurchaseRecords customer13 = new CustomerPurchaseRecords("Bat", "aaa", 45);
        customerPurchaseRecords.add(customer1);
        customerPurchaseRecords.add(customer2);
        customerPurchaseRecords.add(customer3);
        customerPurchaseRecords.add(customer4);
        customerPurchaseRecords.add(customer5);
        customerPurchaseRecords.add(customer6);
        customerPurchaseRecords.add(customer7);
        customerPurchaseRecords.add(customer8);
        customerPurchaseRecords.add(customer9);
        customerPurchaseRecords.add(customer10);
        customerPurchaseRecords.add(customer11);
        customerPurchaseRecords.add(customer12);
        customerPurchaseRecords.add(customer13);
        Collections.sort(customerPurchaseRecords);
        System.out.println(customerPurchaseRecords);
    }

    public static void main(String[] args) {
        new ProductNameAndNumberSorted();
    }
}
