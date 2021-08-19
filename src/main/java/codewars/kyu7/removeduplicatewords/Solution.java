package codewars.kyu7.removeduplicatewords;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * url: https://www.codewars.com/kata/5b39e3772ae7545f650000fc
 */
class Solution {
    public static String removeDuplicateWords(String s) {
        return Arrays.stream(s.split(" ")).distinct().collect(Collectors.joining(" "));
    }
}
