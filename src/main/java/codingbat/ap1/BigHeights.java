package codingbat.ap1;

public class BigHeights {
    public int bigHeights(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < heights.length && i < end; i++) {
            sum += Math.abs(heights[i] - heights[i + 1]) >= 5 ? 1 : 0;
        }
        return sum;
    }
}
