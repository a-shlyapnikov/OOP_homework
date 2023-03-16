package HW03;

import java.util.ArrayList;
import java.util.List;

public class WordGameEng extends AbstractGame{
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<>();
        for (int i = 97; i < 123 ; i++) {
            charList.add(String.valueOf(Character.toChars(i)));
        }
        return charList;
    }
}
