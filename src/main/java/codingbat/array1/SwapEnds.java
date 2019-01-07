package codingbat.array1;

import codingbat.ArrayHelper;

import java.util.Arrays;

import static codingbat.ArrayHelper.array;

public class SwapEnds {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(swapEnds(array(1, 2, 3, 4))));
        System.out.println(Arrays.toString(swapEnds(array(1, 2, 3))));
        System.out.println(Arrays.toString(swapEnds(array(8, 6, 7, 9, 5))));
    }

    private static int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = temp;
        return nums;
    }


}
