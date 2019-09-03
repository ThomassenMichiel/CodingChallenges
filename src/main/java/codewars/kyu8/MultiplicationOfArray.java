package codewars.kyu8;

import java.util.Arrays;

public class MultiplicationOfArray {
  public static int grow(int[] x){
    return Arrays.stream(x)
            .reduce((left, right) -> left * right)
            .orElse(0);
  }
}
