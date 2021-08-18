package codewars.kyu7.findthenextperfectsquare;

/**
 * https://www.codewars.com/kata/56269eb78ad2e4ced1000013
 */
public class NumberFun {
  public static long findNextSquare(long sq) {
      double square = Math.sqrt(sq);
      return square % 1 == 0 ? (long) Math.pow(square + 1, 2) : -1;
  }
}
