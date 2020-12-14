package adapter.animal;

public class Sparrow implements Bird {

    @Override
    public void fly() {
        System.out.println("Sparrow is Flying");
    }

    @Override
    public void makeSound() {
        System.out.println("*Sparrow Noises*");
    }
}
