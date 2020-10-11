package src;

public class AnimalMain {
    public static void main(String[] args) {
        displayAnimals();
    }

    private static void displayAnimals() {

        // Creating an array of animal objects
        AnimalHelper helper = new AnimalHelper(new Animal[] {
            new Cow(),
            new Cat(),
            new Dog(),
            new Horse()
        });
        
        // Displaying information about the animals
        helper.displayInformation();
        helper.displayAveragePrice();
    }
}
