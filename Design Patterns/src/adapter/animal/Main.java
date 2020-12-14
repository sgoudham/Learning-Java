package adapter.animal;

public class Main {
    public static void main(String[] args) {

        Bird sparrow = new Sparrow();
        ToyDuck plasticToyDuck = new PlasticToyDuck();

        System.out.println("Sparrow...");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("\nPlasticToyDuck...");
        plasticToyDuck.squeak();

        System.out.println("\nBirdAdapter...");
        ToyDuck birdAdapter = new BirdAdapter(sparrow);
        birdAdapter.squeak();

    }
}
