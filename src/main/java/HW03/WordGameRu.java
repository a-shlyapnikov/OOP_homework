package HW03;

import java.util.ArrayList;
import java.util.List;

public class WordGameRu extends AbstractGame{
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<>();
        for (int i = 1072; i < 1104 ; i++) {
            charList.add(String.valueOf(Character.toChars(i)));
        }
        return charList;
    }
}
