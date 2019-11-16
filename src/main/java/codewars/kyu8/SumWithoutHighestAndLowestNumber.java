package codewars.kyu8;

import java.util.Arrays;

public class SumWithoutHighestAndLowestNumber {
    public static int sum(int[] numbers) {
        if (numbers == null ||numbers.length == 0 || numbers.length == 1) {
          return 0;
        }
        Arrays.sort(numbers);
        return Arrays.stream(Arrays.copyOfRange(numbers, 1, numbers.length - 1))
                .sum();
    }
}
