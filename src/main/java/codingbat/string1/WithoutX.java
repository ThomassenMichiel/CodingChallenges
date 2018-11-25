package codingbat.string1;

public class WithoutX {
    public static void main(String[] args) {
        System.out.println(withoutX("xHix"));
        System.out.println(withoutX("xHi"));
        System.out.println(withoutX("Hxix"));
        System.out.println(withoutX("x"));
        System.out.println(withoutX(""));
    }

    public static String withoutX(String str) {
        if (str.isEmpty()) {
            return str;
        }
        if (str.charAt(0) == 'x') {
            str = str.substring(1);
        }

        if (str.isEmpty()) {
            return str;
        }

        if (str.charAt(str.length()-1) == 'x') {
            str = str.substring(0,str.length()-1);
        }

        return str;
    }
}
