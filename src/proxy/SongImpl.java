package proxy;

public class SongImpl implements Song{
    String file;

    public SongImpl(String file) {
        this.file = file;
        load(file);
    }

    @Override
    public void play() {
        System.out.println("La-la-la");
    }

    void load(String file){
        System.out.printf("Loading................... File %s was loaded successfully", file);
    }
}
