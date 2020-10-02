package codingbat.array3;

public class SquareUp {
    public int[] squareUp(int n) {
        int[] squareUp = new int[n * n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - i - 1) {
                    continue;
                }
                squareUp[i * n + j] = n - j;
            }
        }
        return squareUp;
    }
}
