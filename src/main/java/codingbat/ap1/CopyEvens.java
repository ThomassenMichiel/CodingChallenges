package codingbat.ap1;

public class CopyEvens {
    public int[] copyEvens(int[] nums, int count) {
        int[] evenArray = new int[count];
        for (int i = 0, j = 0; i < nums.length && j < evenArray.length; i++) {
            if (nums[i] % 2 == 0) {
                evenArray[j++] = nums[i];
            }
        }
        return evenArray;
    }
}
