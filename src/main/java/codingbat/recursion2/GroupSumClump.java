package codingbat.recursion2;

public class GroupSumClump {
    public boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return (target == 0);
        }
        int clumpSum = nums[start];
        int count = 1;
        for (int i = start; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                break;
            }
            clumpSum += nums[i];
            count++;
        }
        if (groupSumClump(start + count, nums, target - clumpSum)) {
            return true;
        }
        return groupSumClump(start + count, nums, target);
    }
}
