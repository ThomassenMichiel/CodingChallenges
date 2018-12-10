package codingbat.logic1;

public class LessBy10 {
    public static void main(String[] args) {
        System.out.println(lessBy10(1,7,11));
        System.out.println(lessBy10(1,7,10));
        System.out.println(lessBy10(11, 1,7));
    }

    public static boolean lessBy10(int a, int b, int c) {
        return a - 10 >= b || a - 10 >= c || b - 10 >= c || b - 10 >= a || c - 10 >= a || c - 10 >= b;
    }
}
