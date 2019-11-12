package codewars.kyu8;

public class AreaOfCircle {
  public static double squareArea(double A){
    return Math.round(Math.pow(2 * A / Math.PI, 2)*100d)/100d;
  }
}
