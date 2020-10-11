public class Dog implements Animal {

    @Override
    public String animalName() {
        return "Dog";
    }

    @Override
    public String animalSound() {
        return "Woof Woof";
    }

    @Override
    public double animalPrice() {
        return 15.99;
    }

}
