package codewars.kyu7.pointinaunitcircle;

/**
 * https://www.codewars.com/kata/58da7ae9b340a2440500009c
 */
public class Kata {
    
    public static boolean pointInCircle(double x, double y) {
        return Math.pow(x, 2) + Math.pow(y, 2) < 1;
    }
}
