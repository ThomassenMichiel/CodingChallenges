package codewars.kyu7.arrayseries.productofmaximumsofarray;

import java.util.Arrays;

/**
 * url: https://www.codewars.com/kata/5a63948acadebff56f000018
 */
public class Solution {
    public static long maxProduct(int[] numbers, int sub_size) {
        Arrays.sort(numbers);
        long sum = 1;
        for (int i = numbers.length - 1, j = 0; i >= 0 && j < sub_size; i--, j++) {
            sum *= numbers[i];
        }
        return sum;
    }
}