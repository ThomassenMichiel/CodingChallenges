package codewars.kyu8;

public class TipCalculator {

  public static Integer calculateTip(double amount, String rating) {
    double percentage = 0.0;
    switch (rating.toLowerCase()) {
      case "terrible": percentage = 0.0; break;
      case "poor": percentage = 0.05; break;
      case "good": percentage = 0.1; break;
      case "great": percentage = 0.15; break;
      case "excellent": percentage = 0.2; break;
      default: return null;
    }
    return (int) Math.ceil(amount * percentage);
  }
}
