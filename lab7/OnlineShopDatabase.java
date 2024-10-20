package lab7;
import java.util.*;


public class OnlineShopDatabase {

    String customer;
    String product;
    int productNumber;
    HashMap<String, HashMap<String, Integer>> customers  = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public OnlineShopDatabase() {
        while (scanner.hasNext()) {
            String input = scanner.next();
            if (input.equals("exit")) {
                break;
            }
            customer = input;
            product = scanner.next();
            productNumber = scanner.nextInt();

            customers.computeIfAbsent(customer, k -> new HashMap<>())
                    .merge(product, productNumber, Integer::sum);


        }
        customers.keySet().stream().sorted().forEach(customer -> {
            System.out.println(customer + ":");
            customers.get(customer).forEach((product, productNumber) ->
                    System.out.println(product + " " + productNumber));
        });
    }


    public static void main(String[] args) {
        new OnlineShopDatabase();
    }
}

