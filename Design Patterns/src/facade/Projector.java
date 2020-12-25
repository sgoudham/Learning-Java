package facade;

public class Projector {
    private final String description;
    private final DVDPlayer dvdPlayer;

    public Projector(String description, DVDPlayer dvdPlayer) {
        this.description = description;
        this.dvdPlayer = dvdPlayer;
    }

    public void on() {
        System.out.println(description + " On");
    }

    public void off() {
        System.out.println(description + " Off");
    }

    public void wideScreenMode() {
        System.out.println(description + " in Widescreen Mode (16x9 Aspect Ratio)");
    }

    public void tvMode() {
        System.out.println(description + " in TV Mode (4x3 Aspect Ratio)");
    }

    @Override
    public String toString() {
        return description;
    }
}
