package composite.music.player;

public abstract class SongComponent {

    void add(SongComponent songComponent) {
        throw new UnsupportedOperationException();
    }

    void remove(SongComponent songComponent) {
        throw new UnsupportedOperationException();
    }

    SongComponent getComponent(int componentIndex) { throw new UnsupportedOperationException(); }

    String getSongName() { throw new UnsupportedOperationException(); }

    String getBandName() { throw new UnsupportedOperationException(); }

    int getReleaseYear() { throw new UnsupportedOperationException(); }

    void displaySongInfo() { throw new UnsupportedOperationException(); }
}