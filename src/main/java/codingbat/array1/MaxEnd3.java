package codingbat.array1;

import java.util.Arrays;

public class MaxEnd3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxEnd3(new int[] {1,2,3})));
        System.out.println(Arrays.toString(maxEnd3(new int[] {11,5,9})));
        System.out.println(Arrays.toString(maxEnd3(new int[] {2,11,3})));
    }

    public static int[] maxEnd3(int[] nums) {
        int largest = nums[0] >= nums[2] ? nums[0] : nums[2];
        nums[0] = largest;
        nums[1] = largest;
        nums[2] = largest;
        return nums;
    }
}
