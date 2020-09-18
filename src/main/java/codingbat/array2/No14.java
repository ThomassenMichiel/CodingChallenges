package codingbat.array2;


public class No14 {
    public boolean no14(int[] nums) {
        boolean fours = false;
        boolean ones = false;
        for (int num : nums) {
            if (num == 4) {
                fours = true;
            }
            if (num == 1) {
                ones = true;
            }
        }
        return !fours || !ones;
    }
}
