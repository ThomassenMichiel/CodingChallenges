package codingbat.array1;

import codingbat.ArrayHelper;

import static codingbat.ArrayHelper.array;

public class Unlucky1 {
    public static void main(String[] args) {
        System.out.println(unlucky1(array(1,3,4,5)));
        System.out.println(unlucky1(array(2,1,3,4,5)));
        System.out.println(unlucky1(array(1,1,1)));
    }

    private static boolean unlucky1(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        return nums[0] == 1 && nums[1] == 3 ||
                nums[1] == 1 && nums[2] == 3 ||
                nums[nums.length-2] == 1 && nums[nums.length-1] == 3;
    }
}
