package codingbat.string1;

public class LastChars {
    public static void main(String[] args) {
        System.out.println(lastChars("last","chars"));
        System.out.println(lastChars("yo","java"));
        System.out.println(lastChars("hi",""));
    }

    public static String lastChars(String a, String b) {
        String out = "";
        out += a.length() > 0 ? String.valueOf(a.charAt(0)) : "@";
        out += b.length() > 0 ? String.valueOf(b.charAt(b.length()-1)) : "@";
        return out;
    }
}
