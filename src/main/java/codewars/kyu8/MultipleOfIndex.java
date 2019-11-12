package codewars.kyu8;

import java.util.stream.IntStream;

public class MultipleOfIndex {
  public static int[] multipleOfIndex(int[] array) {
    return IntStream.range(1,array.length)
            .filter(value -> array[value] % value == 0)
            .map(operand -> array[operand])
            .toArray();
  }
}
