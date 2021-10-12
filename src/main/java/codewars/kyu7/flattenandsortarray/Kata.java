package codewars.kyu7.flattenandsortarray;

import java.util.Arrays;

/**
 * url: https://www.codewars.com/kata/57ee99a16c8df7b02d00045f
 */
public class Kata {
    
    public static int[] flattenAndSort(int[][] array) {
        return Arrays.stream(array)
                .flatMapToInt(Arrays::stream)
                .sorted()
                .toArray();
    }
    
}
