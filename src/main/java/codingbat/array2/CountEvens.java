package codingbat.array2;

public class CountEvens {
    public int countEvens(int[] nums) {
        return (int) java.util.Arrays.stream(nums)
                .filter(i -> i % 2 == 0)
                .count();
    }
}
