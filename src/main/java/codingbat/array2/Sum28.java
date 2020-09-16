package codingbat.array2;

public class Sum28 {
    public boolean sum28(int[] nums) {
        return java.util.Arrays.stream(nums)
                .filter(i -> i == 2)
                .sum() == 8;
    }
}
