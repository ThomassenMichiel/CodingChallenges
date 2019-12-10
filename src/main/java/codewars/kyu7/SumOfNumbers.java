package codewars.kyu7;

import java.util.stream.IntStream;

public class SumOfNumbers {
    public static int GetSum(int a, int b) {
        int highestValue = Math.max(a, b);
        int lowestValue = Math.min(a, b);
        return IntStream.rangeClosed(lowestValue, highestValue).sum();
    }
}
