package codingbat.logic2;

public class EvenlySpaced {
    public static void main(String[] args) {
        System.out.println(evenlySpaced(2,4,6)); // t
        System.out.println(evenlySpaced(4,6,2)); // t
        System.out.println(evenlySpaced(4,6,3)); // f
        System.out.println(evenlySpaced(6,2,8)); // f
        System.out.println(evenlySpaced(6,2,4)); // f
        System.out.println(evenlySpaced(10,9,11));
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        int first = Math.abs(a-b);
        int second = Math.abs(b-c);

        if (a > b && b > c) {
            first = Math.abs(a-b);
            second = Math.abs(b-c);
        } else if (a > b && b < c) {
            first = Math.abs(c-a);
            second = Math.abs(a-b);
        } else if (a < b && b > c) {
            first = Math.abs(b-a);
            second = Math.abs(a-c);
        }


        return first == second;
    }
}
