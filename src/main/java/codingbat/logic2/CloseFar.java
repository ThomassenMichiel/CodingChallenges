package codingbat.logic2;

public class CloseFar {
    public static void main(String[] args) {
        System.out.println(closeFar(1, 2, 10));
        System.out.println(closeFar(1, 2, 3));
        System.out.println(closeFar(4, 1, 3));
    }

    private static boolean closeFar(int a, int b, int c) {
        return Math.abs(a-b) <= 1 && Math.abs(a-c) >= 2 && Math.abs(b-c) >= 2 ||
                Math.abs(a-c) <= 1 && Math.abs(a-b) >= 2 && Math.abs(b-c) >= 2;
    }
}
