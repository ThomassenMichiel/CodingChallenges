package codewars.kyu7;

public class RegexEightBitNumber {
  public static boolean eightBitNumber(String n) {
    return n.matches("\\b([0-9]|[1-8][0-9]|9[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\b");
  }
}
