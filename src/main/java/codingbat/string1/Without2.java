package codingbat.string1;

public class Without2 {
    public static void main(String[] args) {
        System.out.println(without2("HelloHe"));
        System.out.println(without2("HelloHi"));
        System.out.println(without2("Hi"));
    }

    public static String without2(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.endsWith(str.substring(0,2))) {
            return str.substring(2);
        }
        return str;
    }
}
