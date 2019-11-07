package codewars.kyu8;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class SumOfDifferences {
  public static int sumOfDifferences(int[] arr) {
    Arrays.sort(arr);
    ArrayUtils.reverse(arr);
    int sum = 0;
    for (int i = 1; i < arr.length; i++) {
      sum += arr[i - 1] - arr[i];
    }
    return sum;
  }
}
