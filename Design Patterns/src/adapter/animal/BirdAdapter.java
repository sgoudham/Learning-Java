package adapter.animal;

public class BirdAdapter implements ToyDuck {

    private Bird bird;
    private static BirdAdapter instance;

    private BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    public static BirdAdapter getInstance(Bird bird) {
        if (instance == null) {
            instance = new BirdAdapter(bird);
        } else if (!instance.bird.equals(bird)) {
            instance.bird = bird;
        }
        return instance;
    }

    @Override
    public void squeak() {
        bird.makeSound();
    }
}
