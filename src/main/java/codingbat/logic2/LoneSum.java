package codingbat.logic2;

public class LoneSum {
    public static void main(String[] args) {
        System.out.println(loneSum(1, 2, 3));
        System.out.println(loneSum(3, 2, 3));
        System.out.println(loneSum(3, 3, 3));
    }

    private static int loneSum(int a, int b, int c) {
        int x = 0;
        int y = 0;
        int z = 0;
        
        if (a != b && a != c) {
            x = a;
        }
        if (b != a && b != c) {
            y = b;
        }
        if (c != b && c != a) {
            z = c;
        }

        return x + y + z;
    }
}
