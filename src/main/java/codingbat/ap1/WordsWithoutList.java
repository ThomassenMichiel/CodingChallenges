package codingbat.ap1;

import java.util.List;

public class WordsWithoutList {
    public List wordsWithoutList(String[] words, int len) {
        return java.util.Arrays.stream(words)
                .filter(s -> s.length() != len)
                .collect(java.util.stream.Collectors.toList());
    }
}
