package codewars.kyu4;

import java.math.BigInteger;

public class GreenNumbers {
    
    public static void main(String[] args) {
        System.out.println(get(5));
    }
    
    public static BigInteger get(final int n) {
        BigInteger pow = new BigInteger(String.valueOf(n)).pow(2);
        BigInteger remainder = BigInteger.ONE;
        for (int i = 0; i < pow.toString().length(); i++) {
            remainder = remainder.multiply(BigInteger.TEN);
        }
        BigInteger remainderResult = pow.remainder(remainder);
        
        if (remainderResult.equals(new BigInteger(String.valueOf(n)))) {
            return remainderResult;
        }
        
        return BigInteger.ZERO;
    }
}