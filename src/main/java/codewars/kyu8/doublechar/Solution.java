package codewars.kyu8.doublechar;

import java.util.stream.Collectors;

/**
 * url: https://www.codewars.com/kata/56b1f01c247c01db92000076
 */
public class Solution {
    public static String doubleChar(String s) {
        return s.chars().mapToObj(value -> String.valueOf((char) value).repeat(2)).collect(Collectors.joining());
    }
}
