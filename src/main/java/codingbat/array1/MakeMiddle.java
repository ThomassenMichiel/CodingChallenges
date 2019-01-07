package codingbat.array1;

import codingbat.ArrayHelper;

import java.util.Arrays;

import static codingbat.ArrayHelper.array;

public class MakeMiddle {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeMiddle(array(1, 2, 3, 4))));
        System.out.println(Arrays.toString(makeMiddle(array(7, 1, 2, 3, 4, 9))));
        System.out.println(Arrays.toString(makeMiddle(array(1, 2))));
    }

    private static int[] makeMiddle(int[] nums) {
        int i = nums.length / 2;
        return new int[]{nums[i-1], nums[i]};
    }
}
