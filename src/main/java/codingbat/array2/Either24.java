package codingbat.array2;

public class Either24 {
    public boolean either24(int[] nums) {
        boolean isTwos = false;
        boolean isFours = false;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                isTwos = true;
            } else if (nums[i] == 4 && nums[i + 1] == 4) {
                isFours = true;
            }
        }
        return isTwos ^ isFours;
    }
}
