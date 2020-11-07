import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparingInt;

public class EnterTheCollector {
    public static void main(String[] args) {
        StreamProduct door = new StreamProduct(1, "Wooden Door", 35);
        StreamProduct floorPanel = new StreamProduct(2, "Floor Panel", 25);
        StreamProduct window = new StreamProduct(3, "Glass Window", 10);

        List<StreamProduct> streamProducts = new ArrayList<>();
        streamProducts.add(door);
        streamProducts.add(floorPanel);
        streamProducts.add(window);
        streamProducts.add(floorPanel);
        streamProducts.add(window);
        streamProducts.add(floorPanel);

        streamProducts
                .stream()
                .filter(product -> product.getWeight() < 30)
                .sorted(comparingInt(StreamProduct::getWeight))
                .forEach(System.out::println);
    }
}
