package codewars.kyu8;

import java.util.Arrays;
import java.util.stream.Stream;

public class SumArray {

  public static double sum(double[] numbers) {
      return Arrays.stream(numbers).sum();
  }
}
