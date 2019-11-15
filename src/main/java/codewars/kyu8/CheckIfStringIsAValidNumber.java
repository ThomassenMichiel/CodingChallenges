package codewars.kyu8;

public class CheckIfStringIsAValidNumber {
    
    public boolean isDigit(String s) {
      try {
        Double.parseDouble(s);
        return true;
      } catch (NumberFormatException e) {
        return  false;
      }
    }
}
