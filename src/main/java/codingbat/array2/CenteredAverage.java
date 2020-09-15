package codingbat.array2;

public class CenteredAverage {
    public int centeredAverage(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int total = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(Math.max(nums[i], nums[i - 1]), max);
            min = Math.min(Math.min(nums[i], nums[i - 1]), min);
            total += nums[i];
        }
        return (total - min - max) / (nums.length - 2);
    }
}
