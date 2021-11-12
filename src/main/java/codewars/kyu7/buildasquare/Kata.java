package codewars.kyu7.buildasquare;

/**
 * url: https://www.codewars.com/kata/59a96d71dbe3b06c0200009c/
 */
public class Kata {
    public static final String generateShape(int n) {
        return ("+".repeat(n) + "\n").repeat(n).replaceAll("\\n$", "");
    }
}
