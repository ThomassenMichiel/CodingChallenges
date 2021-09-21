package codewars.kyu5.piglatin;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * url: https://www.codewars.com/kata/520b9d2ad5c005041100000f
 */
public class PigLatin {
    public static String pigIt(String str) {
        return Arrays.stream(str.split(" "))
                .map(s -> s.matches("[^a-zA-Z]") ? s : s.substring(1) + s.charAt(0) + "ay")
                .collect(Collectors.joining(" "));
    }
}
