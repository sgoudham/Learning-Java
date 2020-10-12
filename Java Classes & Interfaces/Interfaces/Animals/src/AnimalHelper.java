package src;

public class AnimalHelper {

    private final Animal[] animals;
    private double averagePrice;

    public AnimalHelper(Animal[] animals) {
        this.animals = animals;
    }

    public void displayInformation() {
        /* Display the animal information */

        int total = 0;
        double sum = 0.0;

        for (Animal animal : animals) {
            StringBuilder stringBuilder = new StringBuilder();

            stringBuilder.append("\n\nName: " + animal.animalName());
            stringBuilder.append("\nSound: " + animal.animalSound());
            stringBuilder.append("\nPrice: £" + animal.animalPrice());

            System.out.println(stringBuilder.toString());

            total++;
            sum += animal.animalPrice();
        }
        averagePrice = sum / total;
    }

    public void displayAveragePrice() {
        /* Display the average price of all the animals */

        System.out.printf("%nThe Average Price For All The Animals Are: £%.2f", averagePrice);
    }
}
