package codewars.kyu8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stringy {
  public static String stringy(int size) {
    return IntStream.rangeClosed(1,size)
            .mapToObj(i -> i % 2 == 0 ? "0" : "1")
            .collect(Collectors.joining());
  }
}
