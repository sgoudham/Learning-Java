package facade;

public class PopcornPopper {
    private final String description;

    public PopcornPopper(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " On");
    }

    public void off() {
        System.out.println(description + " Off");
    }

    public void pop() {
        System.out.println(description + " popping popcorn!");
    }

    @Override
    public String toString() {
        return description;
    }
}