package HW03;


import java.util.List;

public interface Game {
    void start(Integer sizeWord, Integer maxTry);

    Answer inputAnswer(String value);

    GameStatus getGameStatus();

    GameStatus getGameWin();

    String getHistory();
    String getWord();
}
