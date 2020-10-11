package src;

public class Horse implements Animal {

    @Override
    public String animalName() {
        return "Horse";
    }

    @Override
    public String animalSound() {
        return "Neighh";
    }

    @Override
    public double animalPrice() {
        return 59.99;
    }

}