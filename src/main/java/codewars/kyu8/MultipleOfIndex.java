package codewars.kyu8;

import java.util.stream.IntStream;

public class MultipleOfIndex {
  public static void main(String[] args) {
    multipleOfIndex(new int[]{22, -6, 32, 82, 9, 25});
  }
  public static int[] multipleOfIndex(int[] array) {
    IntStream.range(1,array.length)
            .filter(value -> value % array[value] == 0)
            .forEach(value -> System.out.println(array[value]));
    return null;
  }
}
