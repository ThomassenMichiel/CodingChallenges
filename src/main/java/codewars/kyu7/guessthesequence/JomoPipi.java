package codewars.kyu7.guessthesequence;

import java.util.stream.IntStream;

/**
 * url: https://www.codewars.com/kata/5b45e4b3f41dd36bf9000090
 */
class JomoPipi {
  static int[] sequence(int x) {
      return IntStream.rangeClosed(1, x)
              .mapToObj(String::valueOf)
              .sorted()
              .mapToInt(Integer::valueOf)
              .toArray();
  } 
}
