package codingbat.array1;

import java.util.Arrays;

public class Reverse3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse3(new int[]{1,2,3})));
        System.out.println(Arrays.toString(reverse3(new int[]{5,11,9})));
        System.out.println(Arrays.toString(reverse3(new int[]{7,0,0})));
    }

    public static int[] reverse3(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[2];
        nums[2] = temp;
        return nums;
    }
}
