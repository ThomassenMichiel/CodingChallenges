package codingbat.array2;

public class ShiftLeft {
    public int[] shiftLeft(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        int[] shiftedArray = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            shiftedArray[i-1] = nums[i];
        }
        shiftedArray[nums.length - 1] = nums[0];
        return shiftedArray;
    }
}
