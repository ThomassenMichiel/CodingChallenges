package codingbat.logic1;

public class In1To10 {
    public static void main(String[] args) {
        System.out.println(in1To10(5, false));
        System.out.println(in1To10(11, false));
        System.out.println(in1To10(11, true));
    }

    public static boolean in1To10(int n, boolean outsideMode) {
        return outsideMode ? n <= 1 || n >= 10 : n >= 1 && n <= 10;
    }
}
