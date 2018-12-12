package codingbat.array1;

import java.util.Arrays;

public class MakeLast {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeLast(new int[]{4, 5, 6})));
        System.out.println(Arrays.toString(makeLast(new int[]{1, 2})));
        System.out.println(Arrays.toString(makeLast(new int[]{3})));
    }

    private static int[] makeLast(int[] nums) {
        int[] ints = new int[nums.length * 2];
        ints[ints.length-1] = nums[nums.length-1];
        return ints;
    }
}
