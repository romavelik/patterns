package proxy;

public class SongProxy implements Song {
    SongImpl song;
    String file;

    public SongProxy(String file) {
        this.file = file;
    }

    @Override
    public void play() {
        if(song==null){
            song = new SongImpl(file);
        }
        song.play();
    }
}
