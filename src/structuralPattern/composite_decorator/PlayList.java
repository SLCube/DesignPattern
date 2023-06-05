package structuralPattern.composite_decorator;

import java.util.ArrayList;
import java.util.List;

public class PlayList implements Playable {

    private List<Playable> playables;

    public PlayList() {
        playables = new ArrayList<>();
    }

    public void add(Playable playable) {
        playables.add(playable);
    }

    public void remove(Playable playable) {
        playables.remove(playable);
    }

    @Override
    public void play() {
        System.out.println("Playing playlist : ");

        for (Playable playable : playables) {
            playable.play();
        }
    }
}
