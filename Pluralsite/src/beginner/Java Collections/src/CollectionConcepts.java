import common.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionConcepts {
    public static void main(String[] args) {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        Collection<Product> streamProducts = new ArrayList<>();
        streamProducts.add(door);
        streamProducts.add(floorPanel);
        streamProducts.add(window);

        // Iterating with foreach
        for (Product streamProduct : streamProducts) {
            System.out.println(streamProduct);
        }

        // Broken removal using foreach
        /*
         * for (Product product : products) { if (product.getWeight() > 20) {
         * System.out.println(product); } else { products.remove(product); } }
         */

        // Refactor to use iterator to remove products.
        Iterator<Product> iterator = streamProducts.iterator();
        while (iterator.hasNext()) {
            final Product streamProduct = iterator.next();
            if (streamProduct.getWeight() > 20) {
                iterator.remove();
            }
        }
        System.out.println(streamProducts);

        // 4. other methods
        System.out.println(streamProducts.size());
        System.out.println(streamProducts.isEmpty());
        System.out.println(streamProducts.contains(floorPanel));
        streamProducts.remove(floorPanel);
        System.out.println(streamProducts.contains(floorPanel));

        // 5. removeAll
        List<Product> toRemove = new ArrayList<>();
        toRemove.add(door);
        toRemove.add(floorPanel);

        streamProducts.removeAll(toRemove);
        System.out.println(streamProducts);
    }
}
