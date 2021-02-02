package codewars.kyu6.sumofparts;

import java.util.Arrays;

class SumParts {

  public static int[] sumParts(int[] ls) {
      int total = Arrays.stream(ls).sum();
      int[] results = new int[ls.length+1];
      results[0] = total;
      for (int i = 1; i < ls.length; i++) {
          results[i] = results[i-1] - ls[i-1];
      }
      return results;
  }
}
