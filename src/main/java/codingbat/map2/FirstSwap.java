package codingbat.map2;

import java.util.HashMap;
import java.util.Map;

public class FirstSwap {
    public String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String key = strings[i].substring(0, 1);
            if (map.containsKey(key) && map.get(key) >= 0) {
                String temp = strings[i];
                strings[i] = strings[map.get(key)];
                strings[map.get(key)] = temp;
                map.put(key, -1);
            } else if (!map.containsKey(key)) {
                map.put(key, i);
            }

        }
        return strings;
    }
}
