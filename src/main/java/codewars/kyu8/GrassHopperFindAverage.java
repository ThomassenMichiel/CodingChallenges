package codewars.kyu8;

import java.util.Arrays;

public class GrassHopperFindAverage {
    public static int findAverage(int[] nums) {
        return (int) Arrays.stream(nums).average().getAsDouble();
    }
}
