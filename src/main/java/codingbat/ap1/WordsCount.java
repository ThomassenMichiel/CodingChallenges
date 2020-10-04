package codingbat.ap1;

public class WordsCount {
    public int wordsCount(String[] words, int len) {
        return (int) java.util.Arrays.stream(words).filter(s -> s.length() == len).count();
    }
}
