import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparingInt;

public class StreamProducts {
    public static void main(String[] args) {
        StreamProduct door = new StreamProduct(1, "Wooden Door", 35);
        StreamProduct floorPanel = new StreamProduct(2, "Floor Panel", 25);
        StreamProduct window = new StreamProduct(3, "Glass Window", 10);

        List<StreamProduct> streamProducts = new ArrayList<>();
        streamProducts.add(door);
        streamProducts.add(window);
        streamProducts.add(floorPanel);

        namesOfLightProductsWeightSortedLoop(streamProducts);
        namesOfLightProductsWeightSortedLoopStreamed(streamProducts);
    }

    private static void namesOfLightProductsWeightSortedLoopStreamed(List<StreamProduct> streamProducts) {
        streamProducts.stream()
                .filter(streamProduct -> streamProduct.getWeight() < 30)
                .sorted(comparingInt(StreamProduct::getWeight))
                .map(StreamProduct::getName)
                .forEach(System.out::println);

    }

    private static void namesOfLightProductsWeightSortedLoop(
            List<StreamProduct> streamProducts) {
        List<StreamProduct> lightStreamProducts = new ArrayList<>();

        for (StreamProduct streamProduct : streamProducts) {
            if (streamProduct.getWeight() < 30) {
                lightStreamProducts.add(streamProduct);
            }
        }

        lightStreamProducts.sort(comparingInt(StreamProduct::getWeight));

        for (StreamProduct streamProduct : lightStreamProducts) {
            System.out.println(streamProduct.getName());
        }
    }
}
