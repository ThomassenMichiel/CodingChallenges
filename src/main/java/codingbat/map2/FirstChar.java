package codingbat.map2;

import java.util.HashMap;
import java.util.Map;

public class FirstChar {
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String string : strings) {
            String key = String.valueOf(string.charAt(0));
            if (map.containsKey(key)) {
                map.put(key, map.get(key).concat(string));
            } else {
                map.putIfAbsent(key, string);
            }
        }
        return map;
    }
}
