package factory.coffee;

public class CoffeeFactory {

    public CoffeeFactory(){ }

    public Coffee createCoffee(String item) {
        return switch (item) {
            case "cortado" -> new Cortado();
            case "latte" -> new Latte();
            default -> null;
        };
    }
}
