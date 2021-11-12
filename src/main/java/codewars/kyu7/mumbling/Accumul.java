package codewars.kyu7.mumbling;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * url: https://www.codewars.com/kata/5667e8f4e3f572a8f2000039
 */
public class Accumul {
    
    public static String accum(String s) {
        return IntStream.range(0, s.length())
                .mapToObj(i -> createWord(s.substring(i,i+1), i))
                .collect(Collectors.joining("-"));
    }
    
    private static String createWord(String letter, int times) {
        return letter.toUpperCase() + letter.toLowerCase().repeat(times);
    }
}
