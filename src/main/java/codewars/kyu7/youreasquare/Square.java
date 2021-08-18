package codewars.kyu7.youreasquare;

/**
 * url: https://www.codewars.com/kata/54c27a33fb7da0db0100040e
 */
public class Square {
    public static boolean isSquare(int n) {
        return Math.pow(Math.floor(Math.sqrt(n)), 2) == n;
    }
}
