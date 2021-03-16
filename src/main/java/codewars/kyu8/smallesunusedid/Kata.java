package codewars.kyu8.smallesunusedid;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * url: https://www.codewars.com/kata/55eea63119278d571d00006a/
 */
public class Kata {
    public static int nextId(int[] ids) {
        List<Integer> usedIds = IntStream.of(ids).boxed().collect(Collectors.toList());
        return IntStream.rangeClosed(0, ids.length)
                .filter(o -> !usedIds.contains(o))
                .min()
                .orElse(-1);
    }
}
