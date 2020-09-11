package codingbat.recursion2;

public class SplitOdd10 {
    public boolean splitOdd10(int[] nums) {
        return splitHelper(0, nums, 0, 0);
    }

    public boolean splitHelper(int start, int[] nums, int left, int right) {
        if (start >= nums.length) {
            return (left % 10 == 0 && right % 2 != 0) ||
                    (right % 10 == 0 && left % 2 != 0);
        }
        return splitHelper(start + 1, nums, left + nums[start], right) || splitHelper(start + 1, nums, left, right + nums[start]);
    }
}
