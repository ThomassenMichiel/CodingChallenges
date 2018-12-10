package codingbat.logic1;

public class ShareDigit {
    public static void main(String[] args) {
        System.out.println(shareDigit(12,23));
        System.out.println(shareDigit(12,43));
        System.out.println(shareDigit(12,44));
    }

    public static boolean shareDigit(int a, int b) {
        return a % 10 == b % 10 ||
                a / 10 == b / 10 ||
                a / 10 == b % 10 ||
                a % 10 == b / 10;
    }
}
