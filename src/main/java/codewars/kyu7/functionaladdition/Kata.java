package codewars.kyu7.functionaladdition;

import java.util.function.IntUnaryOperator;

/**
 * url: https://www.codewars.com/kata/538835ae443aae6e03000547
 */
public class Kata {
    
    public static IntUnaryOperator add(int n) {
        return a -> a + n;
    }
    
}
