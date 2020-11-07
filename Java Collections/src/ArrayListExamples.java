import common.Product;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {
    public static void main(String[] args) {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        List<Product> streamProducts = new ArrayList<>();
        streamProducts.add(door);
        streamProducts.add(floorPanel);

        System.out.println(streamProducts);

        // Lists auto-resize, with add method
        streamProducts.add(window);

        System.out.println(streamProducts);

        // We can query for size
        System.out.println(streamProducts.size());

        // Lists have order, we retrieve elements by index
        for (int i = 0; i < streamProducts.size(); i++) {
            // Generic get method
            Product streamProduct = streamProducts.get(i);
            System.out.println(streamProduct);
        }

        // can loop over them with a for loop
        for (Product streamProduct : streamProducts) {
            System.out.println(streamProduct);
        }

        // Can still add duplicates though
        streamProducts.add(window);
    }
}
