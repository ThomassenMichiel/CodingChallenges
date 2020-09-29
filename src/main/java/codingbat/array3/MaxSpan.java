package codingbat.array3;

public class MaxSpan {
    public int maxSpan(int[] nums) {
        int maxSpan = 0;
        for (int i = 0; i < nums.length; i++) {
            int endPosition = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    endPosition = j;
                }
            }
            maxSpan = Math.max(endPosition - i + 1, maxSpan);
        }
        return maxSpan;
    }
}
