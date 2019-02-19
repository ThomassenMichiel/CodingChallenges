package codingbat.logic2;

public class Blackjack {
    public static void main(String[] args) {
        System.out.println(blackjack(19,21));
        System.out.println(blackjack(21,19));
        System.out.println(blackjack(19,22));
    }

    private static int blackjack(int a, int b) {
        if (a > 21) {
            a = Integer.MIN_VALUE;
        }
        if (b > 21) {
            b = Integer.MIN_VALUE;
        }
        if (a-21 <= 0 && a > b) {
            return a;
        }

        if (b-21 <= 0) {
            return b;
        }

        return 0;
    }
}
