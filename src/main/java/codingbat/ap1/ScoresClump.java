package codingbat.ap1;

public class ScoresClump {
    public boolean scoresClump(int[] scores) {
        for (int i = 0; i < scores.length - 2; i++) {
            if ((scores[i] >= scores[i + 1] - 2 && scores[i] <= scores[i + 1] + 2) &&
                    (scores[i] >= scores[i + 2] - 2 && scores[i] <= scores[i + 2] + 2)
            ) {
                return true;
            }
        }
        return false;
    }
}
