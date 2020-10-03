package codingbat.array3;

public class MaxMirror {
    public int maxMirror(int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = nums.length - 1; j >= 0 && i + count < nums.length; j--) {
                if (nums[i + count] == nums[j]) {
                    count++;
                } else {
                    size = Math.max(size, count);
                    count = 0;
                }
            }
            size = Math.max(size, count);
        }
        return size;
    }
}
