package proxy;

public class Main {
    public static void main(String[] args) {
        Song song = new SongProxy("Some random song");
        song.play();
    }
}
