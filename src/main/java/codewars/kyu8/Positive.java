package codewars.kyu8;

import java.util.Arrays;

public class Positive{

  public static int sum(int[] arr){
    return Arrays.stream(arr)
            .filter(num -> num < 0)
            .sum();
  }

}