package composite;

public class Main {
    public static void main(String[] args){

        SongComponent musicFolder = new SongGroup("Goudham's Music Folder", "- A personal collection of songs that I enjoy");

        SongComponent kpopMusic =
                new SongGroup("Kpop",
                        "is a genre of popular music originating in South Korea.");

        SongComponent electronicMusic =
                new SongGroup("\nElectronic",
                        "is music that employs electronic musical instruments, digital instruments or circuitry-based music technology");

        SongComponent jpopMusic =
                new SongGroup("\nJpop",
                        "is a musical genre that entered the musical mainstream of Japan in the 1990s");

        musicFolder.add(kpopMusic);

        kpopMusic.add(new Song("Better", "Twice", 2020));
        kpopMusic.add(new Song("Deja Vu", "Dreamcatcher", 2019));

        musicFolder.add(jpopMusic);

        jpopMusic.add(new Song("PA PA YA", "BabyMetal", 2019));
        jpopMusic.add(new Song("Megitsune", "BabyMetal", 2013));

        musicFolder.add(electronicMusic);

        electronicMusic.add(new Song("Houndin", "Layto", 2020));
        electronicMusic.add(new Song("Wrong", "Far Out", 2017));

        musicFolder.displaySongInfo();
    }
}
