package structuralPattern.composite_decorator;

public class FilteredSong extends SongDecorator {

    public FilteredSong(Playable song) {
        super(song);
    }

    @Override
    public void play() {
        applyFilter();
        super.play();
    }

    private void applyFilter() {
        System.out.println("Applying filter to the song");
    }
}
