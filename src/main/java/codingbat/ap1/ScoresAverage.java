package codingbat.ap1;

public class ScoresAverage {
    public int scoresAverage(int[] scores) {
        return Math.max(average(scores, 0, scores.length / 2), average(scores, scores.length / 2, scores.length));
    }

    public int average(int[] scores, int start, int end) {
        return (int) java.util.stream.IntStream.range(start, end)
                .map(i -> scores[i])
                .average()
                .getAsDouble();
    }
}
