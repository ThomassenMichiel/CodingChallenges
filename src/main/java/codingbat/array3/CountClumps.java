package codingbat.array3;

public class CountClumps {
    public int countClumps(int[] nums) {
        int totalClump = 0;
        boolean match = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] && !match) {
                match = true;
                totalClump++;
            } else if (nums[i] != nums[i + 1]) {
                match = false;
            }
        }
        return totalClump;
    }
}
