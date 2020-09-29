package codingbat.array2;

public class WithoutTen {
    public int[] withoutTen(int[] nums) {
        int[] withoutTen = new int[nums.length];
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                withoutTen[j] = nums[i];
                j++;
            }
        }
        return withoutTen;
    }
}
