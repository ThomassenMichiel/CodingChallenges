package codingbat.string2;

import java.util.stream.Collectors;

public class RepeatSeparator {
    public String repeatSeparator(String word, String sep, int count) {
        return java.util.stream.IntStream.range(0,count)
                .mapToObj(s -> word)
                .collect(Collectors.joining(sep));
    }
}
