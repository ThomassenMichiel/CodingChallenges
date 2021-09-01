package codewars.kyu6.characterwithlongestconsecutiverepetition;

/**
 * https://www.codewars.com/kata/586d6cefbcc21eed7a001155
 */
public class Solution {
    public static Object[] longestRepetition(String s) {
        if (s.isEmpty()) {
            return new Object[]{"", 0};
        }
        char currentChar = s.charAt(0);
        char longestChar = s.charAt(0);
        int count = 0;
        int longestCount = -1;
        for (char c : s.toCharArray()) {
            if (c == currentChar) {
                count++;
            }
            if (count > longestCount) {
                longestChar = c;
                longestCount = count;
            }
            if (c != currentChar) {
                currentChar = c;
                count = 1;
            }
        }
        return new Object[]{String.valueOf(longestChar), longestCount};
    }
}
