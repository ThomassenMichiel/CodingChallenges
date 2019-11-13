package codewars.kyu8;

import java.util.Arrays;

public class FirstNElements {
    public static int[] take(int[] arr, int n) {
        if (arr.length == 0) {
            return new int[0];
        } else if (arr.length < n) {
            return arr;
        }
        return Arrays.copyOfRange(arr, 0, n);
    }
}
