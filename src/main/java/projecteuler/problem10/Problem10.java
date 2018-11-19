package projecteuler.problem10;

import org.apache.commons.math3.primes.Primes;

/**
 * Author: snowb
 */
public class Problem10 {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 0; i <= 2_000_000; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int number) {
        return Primes.isPrime(number);
    }

}
