package codingbat.recursion2;

public class SplitArray {
    public boolean splitArray(int[] nums) {
        return splitHelper(0, nums, 0, 0);
    }

    public boolean splitHelper(int start, int[] nums, int left, int right) {
        if (start >= nums.length) {
            return (left == right);
        }
        return splitHelper(start + 1, nums, left + nums[start], right) || splitHelper(start + 1, nums, left, right + nums[start]);
    }
}
