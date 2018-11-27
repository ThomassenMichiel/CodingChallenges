package codingbat.logic1;

public class More20 {
    public static void main(String[] args) {
        System.out.println(more20(20));
        System.out.println(more20(21));
        System.out.println(more20(22));
    }

    public static boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }
}
