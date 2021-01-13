package codewars.kyu7.maxdiff;

import java.util.Arrays;

public class Kata {
    
    public static int maxDiff(int[] lst) {
        return Arrays.stream(lst).max().orElse(0) - Arrays.stream(lst).min().orElse(0);
    }
}
