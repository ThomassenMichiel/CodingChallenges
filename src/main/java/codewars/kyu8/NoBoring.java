package codewars.kyu8;

public class NoBoring {
    public static int noBoringZeros(int n) {
        String s = String.valueOf(n).replaceAll("0+$", "");
        return s.isEmpty() ? 0 : Integer.parseInt(s);
    }
}
