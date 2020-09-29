package codingbat.array2;

public class TwoTwo {
    public boolean twoTwo(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 &&
                    (!(i < nums.length - 1 && nums[i + 1] == 2 ||
                            nums.length > 1 && i > 0 && nums[i - 1] == 2))) {
                return false;
            }
        }
        return true;
    }
}
