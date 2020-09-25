package codingbat.array2;

public class Only14 {
    public boolean only14(int[] nums) {
        return java.util.Arrays.stream(nums)
                .allMatch(value -> value == 1 || value == 4);
    }
}
