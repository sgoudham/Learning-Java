package adapter.media.player;

public class MP4Player implements AdvancedMediaPlayer {

    @Override
    public void playVLC(String fileName) {
        // Nothing Happens
    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing MP4 File | Name: " + fileName);
    }
}
