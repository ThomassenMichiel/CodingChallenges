package codingbat.array3;

public class SeriesUp {
    public int[] seriesUp(int n) {
        int[] seriesUp = new int[(n * (n + 1) / 2)];
        System.out.println(seriesUp.length);
        for (int i = 0; i < seriesUp.length; i++) {
            for (int j = 0; j < i; j++) {
                seriesUp[i] = j;
            }
        }
        return seriesUp;
    }
}
