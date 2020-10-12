package src;

public class Cow implements Animal {

    @Override
    public String animalName() {
        return "Cow";
    }

    @Override
    public String animalSound() {
        return "Moooo";
    }

    @Override
    public double animalPrice() {
        return 10.99;
    }

}
