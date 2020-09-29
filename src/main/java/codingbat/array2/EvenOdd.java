package codingbat.array2;

public class EvenOdd {
    public int[] evenOdd(int[] nums) {
        int[] evenOdd = new int[nums.length];
        for (int i = 0, j = 0, k = nums.length - 1; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenOdd[j++] = nums[i];
            } else {
                evenOdd[k--] = nums[i];
            }
        }
        return evenOdd;
    }
}
