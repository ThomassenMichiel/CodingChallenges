package codewars.kyu8.gravityflip;

import org.apache.commons.lang3.ArrayUtils;

import java.util.stream.IntStream;

/**
 * url: https://www.codewars.com/kata/5f70c883e10f9e0001c89673
 */
public class Kata {
    public static int[] flip(char dir, int[] arr) {
        int[] sorted = IntStream.of(arr)
                .sorted()
                .toArray();
        if (dir == 'L') {
            ArrayUtils.reverse(sorted);
        }
        return sorted;
    }
}
