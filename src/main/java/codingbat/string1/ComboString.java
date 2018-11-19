package codingbat.string1;

public class ComboString {
    public static void main(String[] args) {
        System.out.println(comboString("Hello","hi"));
        System.out.println(comboString("hi","Hello"));
        System.out.println(comboString("aaa","b"));
    }

    public static String comboString(String a, String b) {
        return a.length() < b.length() ? a + b + a : b + a + b;
    }
}
