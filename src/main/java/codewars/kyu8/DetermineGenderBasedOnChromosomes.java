package codewars.kyu8;

public class DetermineGenderBasedOnChromosomes {
  public static String chromosomeCheck(String sperm) {
    return "Congratulations! You're going to have a " + (sperm.equals("XX") ? "daughter" : "son") + ".";
  }
}
