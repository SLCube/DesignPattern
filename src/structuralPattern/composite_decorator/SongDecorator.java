package structuralPattern.composite_decorator;

public abstract class SongDecorator implements Playable {

    private Playable song;

    public SongDecorator(Playable song) {
        this.song = song;
    }

    @Override
    public void play() {
        song.play();
    }
}
