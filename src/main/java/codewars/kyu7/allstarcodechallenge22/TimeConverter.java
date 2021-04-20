package codewars.kyu7.allstarcodechallenge22;

/**
 * https://www.codewars.com/kata/5865cff66b5699883f0001aa
 */
public class TimeConverter{
  public static String toTime(int seconds){
      return String.format("%d hour(s) and %d minute(s)", seconds / 3600, seconds % 3600 / 60);
  }
}
