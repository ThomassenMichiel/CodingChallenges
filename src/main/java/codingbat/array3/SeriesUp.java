package codingbat.array3;

public class SeriesUp {
    public int[] seriesUp(int n) {
        int[] seriesUp = new int[(n*(n + 1)/2)];
        for (int i = 0, k = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                seriesUp[k++] = j;
            }
        }
        return seriesUp;
    }
}
