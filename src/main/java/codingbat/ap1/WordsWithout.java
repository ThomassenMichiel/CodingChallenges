package codingbat.ap1;

public class WordsWithout {
    public String[] wordsWithout(String[] words, String target) {
        return java.util.Arrays.stream(words)
                .filter(w -> !target.equals(w))
                .toArray(String[]::new);
    }
}
