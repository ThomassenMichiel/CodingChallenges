package codewars.kyu6.stopgninnipsmysdrow;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {
    
    public String spinWords(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(this::reverseWord)
                .collect(Collectors.joining(" "));
    }
    
    public String reverseWord(String word) {
        if (word.length() <= 4) {
            return word;
        }
        return new StringBuilder(word).reverse().toString();
    }
}
