package codewars.kyu7.shortestword;

import java.util.Arrays;
import java.util.Comparator;

/**
 * url: https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9/
 */
public class Kata {
    public static int findShort(String s) {
        return Arrays.stream(s.split(" "))
                .min(Comparator.comparingInt(String::length))
                .orElse("")
                .length();
    }
}
