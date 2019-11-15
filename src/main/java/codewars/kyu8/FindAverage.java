package codewars.kyu8;

import java.util.Arrays;

public class FindAverage {
  public static double find_average(int[] array){
    return Arrays.stream(array).average().getAsDouble();
  }
}
