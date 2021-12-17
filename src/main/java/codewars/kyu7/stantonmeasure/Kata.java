package codewars.kyu7.stantonmeasure;

import java.util.Arrays;

public class Kata {
    public static int stantonMeasure(int[] arr) {
        long amountOfOnes = Arrays.stream(arr).filter(i -> i == 1).count();
        return (int) Arrays.stream(arr).filter(i -> i == amountOfOnes).count();
    }
}
