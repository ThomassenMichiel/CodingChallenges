package codewars.kyu8;

public class Solution {
  public static int century(int number) {
    int century = number/100;
    if (number % 100 != 0) {
      century++;
    }
    return century;
  }
}
