package codingbat.recursion2;

public class Split53 {
    public boolean split53(int[] nums) {
        return splitHelper(0, nums, 0, 0);
    }

    public boolean splitHelper(int start, int[] nums, int left, int right) {
        if (start >= nums.length) {
            return (left == right);
        }
        if (nums[start] % 5 == 0) {
            return splitHelper(start + 1, nums, left + nums[start], right);
        } else if (nums[start] % 3 == 0) {
            return splitHelper(start + 1, nums, left, right + nums[start]);
        }
        return splitHelper(start + 1, nums, left + nums[start], right) || splitHelper(start + 1, nums, left, right + nums[start]);
    }
}
