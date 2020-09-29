package codingbat.array2;

public class SameEnds {
    public boolean sameEnds(int[] nums, int len) {
        boolean isEqual = true;
        for (int i = 0; i < len; i++) {
            isEqual = nums[i] == nums[nums.length-1];
        }
        return isEqual;
    }
}
