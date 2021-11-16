package codewars.kyu7.regexpbasics.isitaletter;

/**
 * url: https://www.codewars.com/kata/567de72e8b3621b3c300000b/
 */
public class StringUtils {
  public static boolean isLetter(String s) {
    return s.matches("(?i)[a-z]");
  }
}
