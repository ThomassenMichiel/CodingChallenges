package codingbat.string1;

public class NonStart {
    public static void main(String[] args) {
        System.out.println(nonStart("Hello","There"));
        System.out.println(nonStart("java","code"));
        System.out.println(nonStart("shotl","java"));
    }

    public static String nonStart(String a, String b) {
        a = a.substring(1);
        b = b.substring(1);
        return a + b;
    }
}
