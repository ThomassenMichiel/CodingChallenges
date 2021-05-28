package codewars.kyu7.largestpairinasequence;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * url: https://www.codewars.com/kata/556196a6091a7e7f58000018
 */
public class Solution{
    public static int largestPairSum(int[] numbers){
        return Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .flatMapToInt(IntStream::of)
                .sum();
    }
}
