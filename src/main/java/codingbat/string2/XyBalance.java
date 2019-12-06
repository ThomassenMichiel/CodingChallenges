package codingbat.string2;

public class XyBalance {
    public static boolean xyBalance(String str) {
        String s = str.replaceAll("[a-wz]", "");
        return s.isEmpty() || s.endsWith("y");
    }
}
