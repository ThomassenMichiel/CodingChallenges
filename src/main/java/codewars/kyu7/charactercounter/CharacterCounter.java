package codewars.kyu7.charactercounter;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.codewars.com/kata/56786a687e9a88d1cf00005d
 */
public class CharacterCounter {
    
    public static boolean validateWord(String word) {
        HashMap<String, Integer> counts = new HashMap<>();
        for (String s : word.toLowerCase().split("")) {
            counts.put(s, counts.getOrDefault(s, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() != counts.values().toArray()[0]) {
                return false;
            }
        }
        return true;
    }
}
