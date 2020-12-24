import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UnmodifiableVsImmutable {
    public static void main(String[] args) {
        Map<String, Integer> mutableCountryToPopulation = new HashMap<>();
        mutableCountryToPopulation.put("UK", 67);
        mutableCountryToPopulation.put("USA", 328);

        Map<String, Integer> unmodifiableCountryToPopulation = Collections.unmodifiableMap(mutableCountryToPopulation);
        Map<String, Integer> copiedCountryToPopulation = Map.copyOf(mutableCountryToPopulation);

        // Throws UnsupportedOperationException: unmodifiableCountryToPopulation.put("Germany", 83);
        // Throws UnsupportedOperationException: copiedCountryToPopulation.put("Germany", 83);

        System.out.println("copiedCountryToPopulation = " + copiedCountryToPopulation);
        System.out.println("unmodifiableCountryToPopulation = " + unmodifiableCountryToPopulation);
        mutableCountryToPopulation.put("Germany", 83);
        System.out.println("copiedCountryToPopulation = " + copiedCountryToPopulation);
        System.out.println("unmodifiableCountryToPopulation = " + unmodifiableCountryToPopulation);

        // Short way of constructing a Map
        var countryToPopulation = Map.of("UK", 67, "USA", 328);
        // Throws UnsupportedOperationException: countryToPopulation.put("Germany", 83);

    }
}
