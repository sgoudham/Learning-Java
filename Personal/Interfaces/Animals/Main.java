public class Main {
    public static void main(String[] args) {
        displayAnimals();
    }

    private static void displayAnimals() {
        Helper helper = new Helper(new Animal[] {
            new Cow(),
            new Cat(),
            new Dog(),
            new Horse()
        });
        
        helper.displayInformation();
        helper.displayAveragePrice();
    }
}
