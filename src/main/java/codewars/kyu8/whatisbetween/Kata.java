package codewars.kyu8.whatisbetween;

import java.util.stream.IntStream;

/**
 * url: https://www.codewars.com/kata/55ecd718f46fba02e5000029
 */
public class Kata {

  public static int[] between(int a, int b) {
      return IntStream.rangeClosed(a, b).toArray();
  }
}
