package codewars.kyu7.arrayseries.minimizesumofarray;

import java.util.Arrays;

/**
 * url: https://www.codewars.com/kata/5a523566b3bfa84c2e00010b/
 */
public class Solution {
    public static int minSum(int[] passed) {
        Arrays.sort(passed);
        int sum = 0;
        for (int i = 0; i < passed.length / 2; i++) {
            sum += passed[i] * passed[passed.length - 1 - i];
        }
        return sum;
    }
}