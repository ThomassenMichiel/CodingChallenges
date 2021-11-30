package codewars.kyu7.numberofdecimaldigits;

/**
 * url: https://www.codewars.com/kata/58fa273ca6d84c158e000052/
 */
public class DecTools {
  public static int Digits(long n) {
      int i = 1;
      while (n > 9) {
          n /= 10;
          i++;
      }
      return i;
  }
}
