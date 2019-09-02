package codewars.kyu8;

import java.util.Arrays;

public class TotalPoints {
    public static int points(String[] games) {
        return Arrays.stream(games)
                .map(TotalPoints::parseIntArray)
                .mapToInt(TotalPoints::compare)
                .sum();
    }
    
    private static int[] parseIntArray(String score) {
        return Arrays.stream(score.split(":")).mapToInt(Integer::parseInt).toArray();
    }
    
    private static int compare(int[] scores) {
        if (scores[0] > scores[1]) {
            return 3;
        } else if (scores[0] == scores[1]) {
            return 1;
        }
        return 0;
    }
}