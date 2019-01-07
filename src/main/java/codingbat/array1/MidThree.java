package codingbat.array1;

import codingbat.ArrayHelper;

import java.util.Arrays;

import static codingbat.ArrayHelper.array;

public class MidThree {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(midThree(array(1, 2, 3, 4, 5))));
        System.out.println(Arrays.toString(midThree(array(8, 6, 7, 5, 3, 0, 9))));
        System.out.println(Arrays.toString(midThree(array(1, 2, 3))));
    }

    private static int[] midThree(int[] nums) {
        int i = nums.length / 2;
        return new int[]{nums[i-1],nums[i],nums[i+1]};
    }
}
