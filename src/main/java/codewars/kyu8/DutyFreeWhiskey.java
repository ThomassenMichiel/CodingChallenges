package codewars.kyu8;

public class DutyFreeWhiskey {
  public static int dutyFree(int normPrice, int discount, int hol) {
    return (int) (hol / (normPrice * (discount / 100d)));
  }

}
