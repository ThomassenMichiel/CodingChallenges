package codingbat.array2;

public class Post4 {
    public int[] post4(int[] nums) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                pos = i;
            }
        }
        int[] pre4Array = new int[nums.length - pos - 1];
        for (int i = pos + 1, j = 0; i < nums.length; i++, j++) {
            pre4Array[j] = nums[i];
        }
        return pre4Array;
    }
}
