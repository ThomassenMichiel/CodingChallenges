package codewars.kyu6.helpthebookseller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * url: https://www.codewars.com/kata/54dc6f5a224c26032800005c/
 */
public class StockList {
    
    // 1st parameter is the stocklist (L in example),
    // 2nd parameter is list of categories (M in example)
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOf1stLetter.length == 0 || lstOfArt.length == 0) {
            return "";
        }
        Map<String, Integer> countMap = Arrays.stream(lstOf1stLetter).collect(HashMap::new, (hashMap, s) -> hashMap.put(s, 0), Map::putAll);
        for (String s : lstOfArt) {
            String[] split = s.split(" ");
            countMap.computeIfPresent(split[0].substring(0,1), (s1, integer) -> integer + Integer.parseInt(split[1]));
        }
        
        return countMap.entrySet().stream()
                .map(entry -> String.format("(%s : %d)", entry.getKey(), entry.getValue()))
                .collect(Collectors.joining(" - "));
    }
}
