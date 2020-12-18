package codewars.kyu8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

class MultiplicationTableForNumber {
    public static String multiTable(int num) {
        return IntStream.rangeClosed(1,10)
                .mapToObj(i -> String.format("%d * %d = %d", i, num, i * num))
                .collect(Collectors.joining("\n"));
    }
}
