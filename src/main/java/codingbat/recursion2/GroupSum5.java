package codingbat.recursion2;

public class GroupSum5 {
    public boolean groupSum5(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return (target == 0);
        }
        if (nums[start] % 5 == 0) {
            int increase = 1;
            if (start + 1 < nums.length && nums[start + 1] == 1) {
                increase = 2;
            }
            return groupSum5(start + increase, nums,  target - nums[start]);
        }
        if (groupSum5(start + 1, nums, target - nums[start])) {
            return true;
        }
        return groupSum5(start + 1, nums, target);
    }
}
