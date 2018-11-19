package codingbat.string1;

public class WithoutEnd2 {
    public static void main(String[] args) {
        System.out.println(withoutEnd2("Hello"));
        System.out.println(withoutEnd2("abc"));
        System.out.println(withoutEnd2("ab"));
        System.out.println(withoutEnd2("a"));
    }

    public static String withoutEnd2(String str) {
        if (str.length() < 2) {
            return "";
        }
        return str.substring(1,str.length()-1);
    }
}
