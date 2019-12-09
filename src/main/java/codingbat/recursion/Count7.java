package codingbat.recursion;

public class Count7 {
    public int count7(int n) {
        return n == 7 ? 1 : n < 10 ? 0 : count7(n % 10) + count7(n / 10);
    }
}
