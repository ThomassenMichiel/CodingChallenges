package codewars.kyu7.countingpowersets;

import java.math.BigInteger;


/**
 * url: https://www.codewars.com/kata/54381f0b6f032f933c000108
 */
public class Powers {
    public static BigInteger powers(int[] list) {
        return BigInteger.TWO.pow(list.length);
    }
}
