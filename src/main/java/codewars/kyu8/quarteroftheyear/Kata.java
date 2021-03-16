package codewars.kyu8.quarteroftheyear;

/**
 * url: https://www.codewars.com/kata/5ce9c1000bab0b001134f5af/k
 */
public class Kata {
    public static int quarterOf(int month) {
        return month <= 3 ? 1 :
                month <= 6 ? 2 :
                        month <= 9 ? 3 :
                                4;
    }
}
