package codewars.kyu8;

public class RegexNameValidation {
  public static boolean validateUsr(String s) {
    return s.matches("[a-z0-9_]{4,16}");
  }
}
