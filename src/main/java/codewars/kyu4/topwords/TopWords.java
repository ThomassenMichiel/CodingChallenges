package codewars.kyu4.topwords;

import java.util.*;
import java.util.stream.Collectors;

/**
 * url: https://www.codewars.com/kata/51e056fe544cf36c410000fb
 */
public class TopWords {
    
    public static List<String> top3(String s) {
        HashMap<String, Integer> wordCount = new HashMap<>();
        Arrays.stream(s.split("[^a-zA-Z0-9']"))
                .filter(word -> !word.isBlank() || !word.isEmpty())
                .map(word -> word.replaceAll("[^a-zA-Z0-9']",""))
                .map(word -> word.toLowerCase().strip())
                .filter(s1 -> !s1.equals("'"))
                .filter(s1 -> !s1.matches("'{2,}"))
                .forEach(word -> wordCount.compute(word, (s1, integer) -> integer != null ? integer + 1 : 1));
        return wordCount.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
