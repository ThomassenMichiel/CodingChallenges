package codingbat.recursion;

public class Array11 {
    public int array11(int[] nums, int index) {
        int count = 0;
        if (index >= nums.length) {
            return count;
        }
        if (nums[index] == 11) {
            return count + 1 + array11(nums, index + 1);
        }
        return array11(nums, index + 1);
    }
}
