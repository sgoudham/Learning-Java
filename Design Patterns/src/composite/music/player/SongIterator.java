package composite.music.player;

import java.util.Iterator;
import java.util.List;

public class SongIterator implements Iterator<SongComponent> {
    private final List<SongComponent> playList;
    private int currentIndex = 0;

    public SongIterator(List<SongComponent> playList) {
        this.playList = playList;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < playList.size();
    }

    @Override
    public SongComponent next() {
        if (this.hasNext()) {
            return playList.get(currentIndex++);
        }
        return null;
    }
}
