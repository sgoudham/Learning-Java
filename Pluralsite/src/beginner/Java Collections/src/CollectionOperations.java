import common.Product;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionOperations {
    public static Product door = new Product("Wooden Door", 35);
    public static Product floorPanel = new Product("Floor Panel", 25);
    public static Product window = new Product("Glass Window", 10);

    public static void main(String[] args) {
        var products = new ArrayList<Product>();
        Collections.addAll(products, door, floorPanel, window);

        System.out.println(Collections.max(products, Product.BY_WEIGHT));
        System.out.println(Collections.min(products, Product.BY_WEIGHT));
        Collections.fill(products, null);

        System.out.println("products = " + products);

    }
}
