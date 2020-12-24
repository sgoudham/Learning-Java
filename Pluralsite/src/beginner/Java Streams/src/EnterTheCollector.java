import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

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

        // Printing out list
        List<StreamProduct> lightProducts = streamProducts
                .stream()
                .filter(streamProduct -> streamProduct.getWeight() < 30)
                .sorted(comparingInt(StreamProduct::getWeight))
                .collect(Collectors.toList());

        System.out.println(lightProducts);

        // Mapping the name of the products to product(s) itself
        Map<String, List<StreamProduct>> lightProducts1 = streamProducts
                .stream()
                .filter(streamProduct -> streamProduct.getWeight() < 30)
                .sorted(comparingInt(StreamProduct::getWeight))
                .collect(groupingBy(StreamProduct::getName));

        System.out.println(lightProducts1);

        // Using 1 or more collectors on the data
        Map<String, Long> lightProducts2 = streamProducts
                .stream()
                .filter(streamProduct -> streamProduct.getWeight() < 30)
                .sorted(comparingInt(StreamProduct::getWeight))
                .collect(groupingBy(StreamProduct::getName, counting()));

        System.out.println(lightProducts2);
    }
}
