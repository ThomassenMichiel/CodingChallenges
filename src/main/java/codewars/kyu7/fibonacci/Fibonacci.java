package codewars.kyu7.fibonacci;

/**
 * https://www.codewars.com/kata/57a1d5ef7cb1f3db590002af
 */
public class Fibonacci {
    public static long fib(int n) {
        long a = 0;
        long b = 1;
        long c = 0;
        if (n == 0) {
            return a;
        }
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    
}
