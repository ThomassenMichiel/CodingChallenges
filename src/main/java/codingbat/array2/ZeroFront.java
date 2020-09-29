package codingbat.array2;

public class ZeroFront {
    public int[] zeroFront(int[] nums) {
        int[] zeroFront = new int[nums.length];
        for (int i = 0, j = 0, k = nums.length - 1; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroFront[j++] = nums[i];
            } else {
                zeroFront[k--] = nums[i];
            }
        }
        return zeroFront;
    }
}
