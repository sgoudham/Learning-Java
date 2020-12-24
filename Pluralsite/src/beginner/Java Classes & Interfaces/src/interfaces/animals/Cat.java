package interfaces.animals;

public class Cat implements Animal {

    @Override
    public String animalName() {
        return "Cat";
    }

    @Override
    public String animalSound() {
        return "Meoooww";
    }

    @Override
    public double animalPrice() {
        return 29.99;
    }

}
