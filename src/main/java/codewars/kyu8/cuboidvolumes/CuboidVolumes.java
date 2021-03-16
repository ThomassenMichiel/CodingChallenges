package codewars.kyu8.cuboidvolumes;

import java.util.Arrays;

/**
 * url: https://www.codewars.com/kata/58cb43f4256836ed95000f97/
 */
public class CuboidVolumes {
    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        return Math.abs(Arrays.stream(firstCuboid).reduce((left, right) -> left * right).orElse(0) - Arrays.stream(secondCuboid).reduce((left, right) -> left * right).orElse(0));
    }
}
