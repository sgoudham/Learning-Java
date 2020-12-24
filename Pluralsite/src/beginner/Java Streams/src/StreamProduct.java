import java.util.Objects;

public class StreamProduct {
    private final int id;
    private final String name;
    private final int weight;

    public StreamProduct(final int id, final String name, final int weight) {
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
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public boolean equals(final Object o) {
        if (!(o instanceof StreamProduct)) return false;

        final StreamProduct streamProduct = (StreamProduct) o;

        return Objects.equals(id, streamProduct.id)
                && Objects.equals(weight, streamProduct.weight)
                && Objects.equals(name, streamProduct.name);
    }

    public int hashCode() {
        return Objects.hash(id, name, weight);
    }
}
