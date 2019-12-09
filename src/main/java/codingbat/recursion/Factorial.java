package codingbat.recursion;

public class Factorial {
    public int factorial(int n) {
        if (n > 1) {
            return factorial(n - 1) * n;
        }
        return n;
    }
}
