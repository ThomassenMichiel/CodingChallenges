package codewars.kyu6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOdd {
    public static void main(String[] args) {
        System.out.println(findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
        System.out.println(findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
    }

    public static int findIt(int[] a) {
        return Arrays.stream(a)
                .boxed()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() % 2 != 0)
                .findFirst()
                .get()
                .getKey();
    }
}