package codewars.kyu8;

public class WilsonPrime {
    public static boolean am_i_wilson(double n) {
        // these are the only known wilson primes. calculating the others would be too calculation intensive
        return n == 5 || n == 13 || n == 563;
    }
}
