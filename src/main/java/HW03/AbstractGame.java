package HW03;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractGame implements Game {
    private Integer sizeWord;

    public String getWord() {
        return word;
    }

    String word;
    private Integer maxTry;
    static int countTry;
    GameStatus gameStatus = GameStatus.OFF;
    GameStatus gameWin = GameStatus.WIN;

    List<String> history = new ArrayList<>();

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    /**
     * @return
     */
    private String generateWord() {
        List<String> charList = generateCharList();
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        int index;
        for (int i = 0; i < sizeWord; i++) {
            index = random.nextInt(charList.size());
            sb.append(charList.get(index));
        }
        return sb.toString();

    }

    @Override
    public void start(Integer sizeWord, Integer maxTry) {
        this.maxTry = maxTry;
        this.sizeWord = sizeWord;
        word = generateWord();
        this.gameStatus = GameStatus.START;
    }

    @Override
    public Answer inputAnswer(String value) {
        int bull = 0;
        int cow = 0;
        for (int i = 0; i < value.length(); i++) {
            if (word.contains(Character.toString(value.charAt(i)))) {
                cow++;
            }
            if (word.charAt(i) == value.charAt(i)) {
                bull++;
            }
        }
        countTry++;
        Answer answer = new Answer(cow, bull, value);
        gameStatus = checkState(value);
        history.add(value);
        return answer;
    }

    private GameStatus checkState(String value) {
        if (value.equals(word)) {
            return gameStatus = GameStatus.WIN;
        } else {
            if (countTry >= maxTry) {
                return gameStatus = GameStatus.LOSE;
            } else {
                return gameStatus = GameStatus.START;
            }
        }
    }

    @Override
    public String getHistory() {
        StringBuilder sb = new StringBuilder();
        for (String item : history) {
            sb.append(item + "\n");
        }
        return sb.toString();
    }


    abstract List<String> generateCharList();
}

