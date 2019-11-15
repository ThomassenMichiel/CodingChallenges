package codewars.kyu8;

public class DatingRange {
  public static String datingRange(int age) {
    int min;
    int max;
    if (age <= 14) {
      min = (int) (age - 0.10 * age);
      max = (int) (age + 0.10 * age);
    } else {
      min = (int) (age / 2.0 + 7);
      max = (int) (min * 2.0);
    }
    return min + "-" + max;
  }
}
