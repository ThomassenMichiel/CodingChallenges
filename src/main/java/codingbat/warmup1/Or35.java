package codingbat.warmup1;

public class Or35 {
    public static void main(String[] args) {
        System.out.println(or35(5));
        System.out.println(or35(50));
        System.out.println(or35(8));
        System.out.println(or35(30));
    }

    public static boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }
}
