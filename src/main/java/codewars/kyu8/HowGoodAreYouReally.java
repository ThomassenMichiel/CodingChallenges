package codewars.kyu8;

import java.util.Arrays;

public class HowGoodAreYouReally {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        return Arrays.stream(classPoints).summaryStatistics().getAverage() < yourPoints;
    }
}
