package codewars.kyu7.arrayseries.arrayleaders;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * url: https://www.codewars.com/kata/5a651865fd56cb55760000e0/
 */
public class Solution {
    public static List<Integer> arrayLeaders(int[] numbers) {
        ArrayList<Integer> leaders = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            int sum = IntStream.range(i+1, numbers.length)
                    .map(j -> numbers[j])
                    .sum();
            if (numbers[i] > sum) {
                leaders.add(numbers[i]);
            }
        }
        return leaders;
    }
}