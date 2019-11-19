package codingbat.logic2;

public class EvenlySpaced {
    public static boolean evenlySpaced(int a, int b, int c) {
        return (a - b == b - c) || (a - c == c - b) || (a - b == c - a);
    }
}
