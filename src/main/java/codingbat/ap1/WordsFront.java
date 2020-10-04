package codingbat.ap1;

public class WordsFront {
    public String[] wordsFront(String[] words, int n) {
        return java.util.stream.IntStream
                .range(0, n)
                .mapToObj(i -> words[i])
                .toArray(String[]::new);
    }
}
