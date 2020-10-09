package codingbat.map2;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {
    public Map<String, Integer> wordCount(String[] strings) {
        return java.util.Arrays.stream(strings).collect(java.util.stream.Collectors.toMap(s -> s, s -> 1, Integer::sum));
    }
}
