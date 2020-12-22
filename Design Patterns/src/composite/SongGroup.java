package composite;

import java.util.ArrayList;
import java.util.List;

public class SongGroup extends SongComponent {

    private final List<SongComponent> songComponents = new ArrayList<>();
    private final String groupName;
    private final String groupDescription;

    public SongGroup(String groupName, String groupDescription) {
        this.groupName = groupName;
        this.groupDescription = groupDescription;
    }

    public SongIterator createIterator() { return new SongIterator(songComponents); }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupDescription() { return groupDescription; }

    @Override
    public void add(SongComponent songComponent) { songComponents.add(songComponent); }

    @Override
    public void remove(SongComponent songComponent) { songComponents.remove(songComponent); }

    @Override
    public SongComponent getComponent(int componentIndex) { return songComponents.get(componentIndex); }

    @Override
    public void displaySongInfo() {
        System.out.println(getGroupName() + " " + getGroupDescription() + "\n");

        SongIterator songIterator = createIterator();
        while (songIterator.hasNext()) {
            SongComponent songInfo = songIterator.next();
            songInfo.displaySongInfo();
        }
    }
}
