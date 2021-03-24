package codewars.kyu7.countthedigit;

import java.util.stream.IntStream;

/**
 * url: https://www.codewars.com/kata/566fc12495810954b1000030
 */
public class CountDig {
    public static int nbDig(int n, int d) {
        return (int) IntStream.rangeClosed(0, n)
                .map(i -> i * i)
                .mapToObj(String::valueOf)
                .flatMap(s -> s.chars().boxed())
                .map(i -> i - 48)
                .filter(i -> i == d)
                .count();
    }
}
