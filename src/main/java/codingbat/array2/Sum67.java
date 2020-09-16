package codingbat.array2;

public class Sum67 {
    public int sum67(int[] nums) {
        int sum = 0;
        boolean ignored = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 7 && ignored) {
                ignored = false;
                continue;
            } else if (nums[i] == 6 || ignored) {
                ignored = true;
                continue;
            }
            sum += nums[i];
        }
        return sum;
    }
}
