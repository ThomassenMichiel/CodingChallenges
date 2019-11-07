package codewars.kyu8;

public class Integrals {

    public static String integrate(int coefficient, int exponent) {
        return coefficient/++exponent + "x^" + exponent;
    }
  
}
