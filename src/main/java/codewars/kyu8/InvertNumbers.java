package codewars.kyu8;

import java.util.Arrays;

public class InvertNumbers {
    public static int[] invert(int[] array) {
        return Arrays.stream(array)
                .map(i -> -i)
                .toArray();
    }
}
