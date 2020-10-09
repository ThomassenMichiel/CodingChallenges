package codingbat.map2;

import java.util.HashMap;
import java.util.Map;

public class FirstChar {
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> result = new HashMap<>();
        for (String string : strings) {
            String key = String.valueOf(string.charAt(0));
            if (!result.containsKey(key)) {
                result.put(key, string);
            } else {
                result.put(key, result.get(key).concat(string));
            }
        }
        return result;
    }
}
