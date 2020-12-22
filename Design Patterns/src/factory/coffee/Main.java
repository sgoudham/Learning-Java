package factory.coffee;

public class Main {

    public static void main(String[] args) {
        MoonBucks moonBucks = new MoonBucks();

        Coffee latte = moonBucks.orderCoffee("latte");
        System.out.println("-------------------------------------\nLatte Was Ordered: " + latte);

        System.out.println();

        Coffee cortado = moonBucks.orderCoffee("cortado");
        System.out.println("-------------------------------------\nCortado Was Ordered: " + cortado);
    }
}
