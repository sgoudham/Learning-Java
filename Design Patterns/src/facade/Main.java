package facade;

public class Main {
    public static void main(String[] args) {

        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner");
        DVDPlayer dvd = new DVDPlayer("Top-O-Line DVD Player", amp);
        CDPlayer cd = new CDPlayer("Top-O-Line CD Player", amp);
        Projector projector = new Projector("Top-O-Line Projector", dvd);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);

        homeTheater.watchMovie("Raiders of the Lost Ark");
        System.out.println("\n");
        homeTheater.endMovie();
    }
}
