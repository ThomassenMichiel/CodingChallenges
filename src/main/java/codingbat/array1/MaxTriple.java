package codingbat.array1;

import codingbat.ArrayHelper;

import static codingbat.ArrayHelper.array;

public class MaxTriple {
    public static void main(String[] args) {
        System.out.println(maxTriple(array(1, 2, 3)));
        System.out.println(maxTriple(array(1, 5, 3)));
        System.out.println(maxTriple(array(5, 2, 3)));
    }

    private static int maxTriple(int[] nums) {
        int largest = nums[0] >= nums[nums.length-1] ? nums[0] : nums[nums.length-1];
        return largest >= nums[nums.length/2] ? largest : nums[nums.length/2];
    }
}
