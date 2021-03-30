package codewars.kyu7.finddivisors;

import java.util.stream.IntStream;

/**
 * url: https://www.codewars.com/kata/542c0f198e077084c0000c2e/
 */
public class FindDivisor {
    
    public long numberOfDivisors(int n) {
        return IntStream.rangeClosed(1, n)
                .filter(value -> n % value == 0)
                .count();
    }
}
