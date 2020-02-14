package codewars.kyu7;

public class RegexSixBitNumber {
  public static boolean sixBitNumber(String n) {
    return n.matches("\\b[1-5][0-9]|6[0-3]|[0-9]");
  }
}
