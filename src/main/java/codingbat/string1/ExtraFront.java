package codingbat.string1;

public class ExtraFront {
    public static void main(String[] args) {
        System.out.println(extraFont("Hello"));
        System.out.println(extraFont("ab"));
        System.out.println(extraFont("h"));
    }

    public static String extraFont(String str) {
        if (str.length() < 2) {
            return str + str + str;
        }
        return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
    }
}
