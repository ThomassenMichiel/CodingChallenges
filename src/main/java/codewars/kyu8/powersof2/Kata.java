package codewars.kyu8.powersof2;

import java.util.stream.LongStream;

/**
 * url: https://www.codewars.com/kata/57a083a57cb1f31db7000028
 */
public class Kata {
    public static long[] powersOfTwo(int n) {
        return LongStream.rangeClosed(0,n)
                .map(value -> (long) Math.pow(2, value))
                .toArray();
    }
}