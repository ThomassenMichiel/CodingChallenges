package codingbat.recursion2;

public class GroupSum {
    public boolean groupSum(int start, int[] nums, int target) {
        if (target == 0) {
            return true;
        }
        if (start >= nums.length) {
            return false;
        }
        System.out.println("test");
        if (nums[start] <= target) {
            return groupSum(start, nums, target - nums[start]);
        }
        return groupSum(start+1, nums, nums[start]);
    }
}
