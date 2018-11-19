package codingbat.warmup1;

public class In1020 {
    public static void main(String[] args) {
        System.out.println(in1020(11,19));
        System.out.println(in1020(19,11));
        System.out.println(in1020(11,9));
        System.out.println(in1020(1,9));
        System.out.println(in1020(31,29));
    }

    public static int in1020(int a, int b) {
        return ((a > 20 || a < 10) && (b < 10 || b > 20)) ? 0 : Math.max(a,b);
    }
}
