package codingbat.ap1;

public class ScoresSpecial {
    public int scoresSpecial(int[] a, int[] b) {
        return largestSpecialScore(a) + largestSpecialScore(b);
    }

    public int largestSpecialScore(int[] arr) {
        return java.util.Arrays.stream(arr)
                .filter(i -> i % 10 == 0)
                .max()
                .orElse(0);
    }
}
