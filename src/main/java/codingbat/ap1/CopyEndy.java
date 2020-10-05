package codingbat.ap1;

public class CopyEndy {
    public int[] copyEndy(int[] nums, int count) {
        return java.util.Arrays.stream(nums)
                .filter(i -> i >= 0 && i <= 10 || i >= 90 && i <= 100)
                .limit(count)
                .toArray();
    }
}
