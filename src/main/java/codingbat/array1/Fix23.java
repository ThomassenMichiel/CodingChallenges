package codingbat.array1;

import codingbat.ArrayHelper;

import java.util.Arrays;

public class Fix23 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fix23(ArrayHelper.array(1, 2, 3))));
        System.out.println(Arrays.toString(fix23(ArrayHelper.array(2, 3, 5))));
        System.out.println(Arrays.toString(fix23(ArrayHelper.array(1, 2, 1))));
    }

    public static int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
        }
        if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
        }
        return nums;
    }
}
