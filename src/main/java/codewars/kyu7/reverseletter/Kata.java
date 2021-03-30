package codewars.kyu7.reverseletter;

/**
 * url: https://www.codewars.com/kata/58b8c94b7df3f116eb00005b
 */
public class Kata {
    public static String reverseLetter(final String str) {
        return new StringBuilder(str.replaceAll("[^a-zA-Z]", "")).reverse().toString();
    }
}
