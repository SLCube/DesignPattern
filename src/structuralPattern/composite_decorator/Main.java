package structuralPattern.composite_decorator;

/**
 * 각 패턴들의 목적
 *
 * 1. adapter pattern : 이미 존재하는 두 인터페이스의 불일치를 해결하기 위해 사용(설계가 끝난뒤에 사용할 가능성이 높음)
 * 2. bridge pattern : 추상적인 개념과 구현을 따로 만들고 이를 연결하기 위해 사용(설계가 완료되기 이전에 사용될 가능성이 높음)
 * 3. facade pattern : 여러 객체(여러 인터페이스)를 모아 새로운 인터페이스를 정의하기 위해 사용
 * 4. decorator pattern : 상속없이 객체에 새로운 서비스를 추가하기 위해 사용
 * 5. composite pattern : 관련된 객체들을 하나의 인터페이스로 다룰수 있도록 일관성을 부여
 * 6. proxy pattern : 대리인을 통해 불편한(무거운)작업을 꼭 필요할 때만 진행하기 위해 사용
 *
 * 구조패턴의 경우 얼핏보면 패턴들의 구조가 다 비슷해 보일 순 있어도, 목적이 전혀 다름
 *
 * 각 목적을 이해하고 적절한 곳에 패턴을 사요할 수 있도록 연습이 많이 필요해보임.
 */
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
