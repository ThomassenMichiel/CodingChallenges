package codingbat.string1;

public class FrontAgain {
    public static void main(String[] args) {
        System.out.println(frontAgain("edited"));
        System.out.println(frontAgain("edit"));
        System.out.println(frontAgain("ed"));
    }

    public static boolean frontAgain(String str) {
        return str.length() >= 2 && str.endsWith(str.substring(0, 2));
    }
}
