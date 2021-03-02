package codewars.kyu6.convertstringtocamelcase;

import java.util.Arrays;

/**
 * url: https://www.codewars.com/kata/517abf86da9663f1d2000003/
 */
class Solution {
    
    static String toCamelCase(String s) {
        String[] words = s.split("[-_]");
        StringBuilder sb = new StringBuilder(words[0]);
        Arrays.stream(words, 1, words.length)
                .map(s1 -> s1.substring(0,1).toUpperCase() + s1.substring(1))
                .forEach(sb::append);
        return sb.toString();
    }
}
