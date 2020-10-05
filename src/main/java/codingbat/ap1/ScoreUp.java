package codingbat.ap1;

public class ScoreUp {
    public int scoreUp(String[] key, String[] answers) {
        return java.util.stream.IntStream.range(0, key.length)
                .map(i -> checkAnswer(key[i], answers[i]))
                .sum();
    }

    public int checkAnswer(String key, String answer) {
        int points = -1;
        if ("?".equals(answer)) {
            points = 0;
        } else if (key.equals(answer)) {
            points = 4;
        }
        return points;
    }
}
