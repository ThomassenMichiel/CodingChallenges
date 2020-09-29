package codingbat.array2;

public class TenRun {
    public int[] tenRun(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        int multipleOf10Holder = nums[0];
        boolean hasMultipleOf10BeenFound = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                multipleOf10Holder = nums[i];
                hasMultipleOf10BeenFound = true;
            }
            if (hasMultipleOf10BeenFound) {
                nums[i] = multipleOf10Holder;
            }
        }
        return nums;
    }
}
