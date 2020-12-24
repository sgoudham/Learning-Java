package common;

import java.util.Comparator;
import java.util.Objects;

import static java.util.Comparator.comparing;

public class Java8Product {

    public static final Comparator<Java8Product> BY_NAME = comparing(Java8Product::getName);

    public static final Comparator<Java8Product> BY_WEIGHT = comparing(Java8Product::getWeight);

    private final int id;
    private final String name;
    private final int weight;

    public Java8Product(final int id, final String name, final int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Product{" + "id=" + id + ", name='" + name + '\'' + ", weight=" + weight + '}';
    }

    public boolean equals(final Object o) {
        if (!(o instanceof Java8Product))
            return false;

        final Java8Product product = (Java8Product) o;

        return Objects.equals(id, product.id) && Objects.equals(weight, product.weight)
                && Objects.equals(name, product.name);
    }

    public int hashCode() {
        return Objects.hash(id, name, weight);
    }
}
