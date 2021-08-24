package codewars.kyu7.aruleofdivisibilityby7;

/**
 * url: https://www.codewars.com/kata/55e6f5e58f7817808e00002e
 */
class DivSeven {
    public static long[] seven(long m) {
        int times = 0;
        while (m > 100) {
            long remainder = m % 10;
            m /= 10;
            m -= remainder * 2;
            times++;
        }
        return new long[]{m, times};
    }
}
