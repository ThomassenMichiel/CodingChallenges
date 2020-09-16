package codingbat.array2;


public class Lucky13 {
    public boolean lucky13(int[] nums) {
        return java.util.Arrays.stream(nums)
                .filter(i -> i != 1)
                .filter(i -> i != 3)
                .count() == nums.length;
    }
}
