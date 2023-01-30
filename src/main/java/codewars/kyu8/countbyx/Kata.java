package codewars.kyu8.countbyx;

import java.util.stream.IntStream;

public class Kata {
    public static int[] countBy(int x, int n) {
        return IntStream.rangeClosed(1, n)
                .map(i -> i * x)
                .toArray();

    }
}
