package codingbat.array2;

public class Pre4 {
    public int[] pre4(int[] nums) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                pos = i;
                break;
            }
        }
        int[] pre4Array = new int[pos];
        for (int i = 0; i < pos; i++) {
            pre4Array[i] = nums[i];
        }
        return pre4Array;
    }
}
