package codewars.kyu8.sumofmultiples;

public class Kata {
    public static long sumMul(int n, int m) {
        if (m <= 0 || n <= 0) {
            throw new IllegalArgumentException();
        }
        int total = 0;
        for (int i = n; i < m; i += n) {
            total += i;
        }
        return total;
    }
}
