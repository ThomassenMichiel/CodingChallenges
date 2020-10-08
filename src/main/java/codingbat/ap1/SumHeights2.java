package codingbat.ap1;

public class SumHeights2 {
    public int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < heights.length && i < end; i++) {
            int change = heights[i] - heights[i + 1];
            sum += Math.abs(change < 0 ? change * 2 : change);
        }
        return sum;
    }
}
