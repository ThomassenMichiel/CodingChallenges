package codewars.kyu8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class CountPositiveSumNegatives {
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }
        long countOfPositives = Arrays.stream(input).filter(i -> i > 0).count();
        int sumOfNegatives = Arrays.stream(input).filter(i -> i < 0).sum();
        return new int[]{(int) countOfPositives,sumOfNegatives};
    }
}