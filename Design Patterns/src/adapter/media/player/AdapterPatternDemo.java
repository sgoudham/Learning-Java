package adapter.media.player;

public class AdapterPatternDemo {
    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp4", "Never Say Never - Justin Bieber");
        audioPlayer.play("vlc", "Better - TWICE");
        audioPlayer.play("mp3", "Fake & True - TWICE");
        audioPlayer.play("avi", "Sunflower - Post Malone");

    }
}
