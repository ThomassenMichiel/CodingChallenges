package codewars.kyu7.arrayseries.maximumgap;

import java.util.Arrays;

/**
 * url: https://www.codewars.com/kata/5a7893ef0025e9eb50000013
 */
public class Solution {
    public static int maxGap(int[] numbers) {
        Arrays.sort(numbers);
        int largestGap = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length - 1; i++) {
            largestGap = Math.max(Math.abs(numbers[i] - numbers[i + 1]), largestGap);
        }
        return largestGap;
    }
}