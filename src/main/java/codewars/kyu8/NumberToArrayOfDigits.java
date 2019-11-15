package codewars.kyu8;

import java.util.stream.IntStream;

public class NumberToArrayOfDigits {
    public static int[] digitize(long n) {
      String[] splitNumber = String.valueOf(n).split("");
      return IntStream.range(0,splitNumber.length)
              .mapToObj(i -> splitNumber[splitNumber.length - 1 - i])
              .mapToInt(Integer::valueOf)
              .toArray();
    }
}
