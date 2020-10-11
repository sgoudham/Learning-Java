public class Helper {
    
    private final Animal[] animals;
    private double averagePrice;

    public Helper(Animal[] animals) {
        this.animals = animals;
    }

    public void displayInformation() {

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
        System.out.printf("\nThe Average Price For All The Animals Are: £%.2f", averagePrice);
    }
}
