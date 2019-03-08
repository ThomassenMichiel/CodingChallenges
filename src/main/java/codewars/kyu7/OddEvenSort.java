package codewars.kyu7;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddEvenSort {
    public static String sortMyString(String s) {
        String first = "";
        String second = "";
        for (int i = 0; i < s.toCharArray().length; i++) {
            if (i % 2 == 0) {
                first += s.charAt(i);
            } else {
                second += s.charAt(i);
            }
        }
        return first + " " + second;
    }
}