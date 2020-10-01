package codingbat.array3;

public class CanBalance {
    public boolean canBalance(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int firstSum = 0;
            int secondSum = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j < i) {
                    firstSum += nums[j];
                } else {
                    secondSum += nums[j];
                }
            }
            if (firstSum == secondSum) {
                return true;
            }
        }
        return false;
    }
}
