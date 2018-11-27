package codingbat.string1;

public class MinCat {
    public static void main(String[] args) {
        System.out.println(minCat("Hello","Hi"));
        System.out.println(minCat("Hello","java"));
        System.out.println(minCat("java","Hello"));
    }

    public static String minCat(String a, String b) {
        if (a.length() == 0 || b.length() == 0) {
            return "";
        }

        int min = Math.min(a.length(), b.length());
        String outA = "";
        String outB = "";
        for (int i = 1; i <= min; i++) {
            outA = a.charAt(a.length()-i) + outA;
            outB = b.charAt(b.length()-i) + outB;
        }

        return outA + outB;
    }
}
