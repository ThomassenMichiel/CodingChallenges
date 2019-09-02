package codewars.kyu8;

import java.util.stream.IntStream;

public class NthPower {
    public static int nthPower(int[] array, int n) {
        return (int) IntStream.of(n)
                .filter(i -> array.length > n)
                .map(i -> array[n])
                .limit(1)
                .mapToDouble(i -> Math.pow(i, n))
                .findFirst()
                .orElse(-1);
    }
}