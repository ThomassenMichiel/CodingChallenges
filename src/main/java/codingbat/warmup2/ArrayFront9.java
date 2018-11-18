package codingbat.warmup2;

import java.util.Arrays;

public class ArrayFront9 {
    public static void main(String[] args) {
        System.out.println(arrayFront9(new int[]{1, 2, 9, 3, 4}));
        System.out.println(arrayFront9(new int[]{1, 2, 3, 4, 9}));
        System.out.println(arrayFront9(new int[]{1, 2, 3, 4, 5}));
    }

    public static boolean arrayFront9(int[] nums) {
        return Arrays.stream(nums).limit(4).anyMatch(value -> value == 9);
    }
}
