package structuralPattern.composite_decorator;

public class EqualizedSong extends SongDecorator {

    public EqualizedSong(Playable song) {
        super(song);
    }

    @Override
    public void play() {
        applyEqualizer();
        super.play();
    }

    private void applyEqualizer() {
        System.out.println("Applying equalizer song");
    }
}
