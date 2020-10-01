package codingbat.array3;

public class Fix45 {
    public int[] fix45(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 4 && nums[i+1] != 5) {
                for (int j = 0; j < nums.length; j++) {
                    if ((nums[j] == 5 && j == 0) || (nums[j] == 5 && nums[j-1] != 4)) {
                        int temp = nums[i + 1];
                        nums[i + 1] = 5;
                        nums[j] = temp;
                    }
                }
            }
        }
        return nums;
    }
}
