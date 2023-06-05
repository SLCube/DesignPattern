package structuralPattern.composite_decorator;

public class Main {
    public static void main(String[] args) {
        Playable song = new Song("Song 1");

        Playable filteredSong = new FilteredSong(song);
        Playable equalizedSong = new EqualizedSong(song);

        PlayList playList = new PlayList();

        playList.add(song);
        playList.add(filteredSong);
        playList.add(equalizedSong);


        playList.play();
    }
}
