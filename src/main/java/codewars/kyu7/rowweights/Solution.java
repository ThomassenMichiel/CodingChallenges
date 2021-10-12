package codewars.kyu7.rowweights;

/**
 * url: https://www.codewars.com/kata/5abd66a5ccfd1130b30000a9
 */
public class Solution {
    public static int[] rowWeights(final int[] weights) {
        int firstRow = 0;
        int secondRow = 0;
        for (int i = 0; i < weights.length; i++) {
            if (i % 2 == 0) {
                firstRow += weights[i];
            } else {
                secondRow += weights[i];
            }
        }
        return new int[]{firstRow, secondRow};
    }
}
