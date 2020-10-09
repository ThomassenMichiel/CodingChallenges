package codingbat.map2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordAppend {
    public String wordAppend(String[] strings) {
        Map<String, Long> map = new HashMap<>();
        String result = "";
        for (String string : strings) {
            if (map.containsKey(string)) {
                map.put(string, map.get(string) + 1);
            } else {
                map.put(string, 1L);
            }
            if (map.get(string) % 2 == 0) {
                result = result.concat(string);
            }
        }
        return result;
    }
}
