package codewars.kyu7.regexpbasics.isitavowel;

/**
 * https://www.codewars.com/kata/567bed99ee3451292c000025/
 */
public class StringUtils {
    public static boolean isVowel(String s) {
        return s.matches("(?i)[aieuo]");
    }
}
