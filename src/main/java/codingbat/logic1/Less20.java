package codingbat.logic1;

public class Less20 {
    public static void main(String[] args) {
        System.out.println(less20(18));
        System.out.println(less20(19));
        System.out.println(less20(20));


    }

    public static boolean less20(int n) {
        return n % 20 == 20-2 || n % 20 == 20-1;
    }
}
