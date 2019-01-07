package codingbat.logic2;

public class RoundSum {
    public static void main(String[] args) {
        System.out.println(roundSum(16,17,18));
        System.out.println(roundSum(12,13,14));
        System.out.println(roundSum(6,4,4));
    }

    private static int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    private static int round10(int n) {
        return (n + 5) / 10 * 10;
    }
}
