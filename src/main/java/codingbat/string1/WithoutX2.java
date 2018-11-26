package codingbat.string1;

public class WithoutX2 {
    public static void main(String[] args) {
        System.out.println(withoutX2("xHi"));
        System.out.println(withoutX2("Hxi"));
        System.out.println(withoutX2("Hi"));
    }

    public static String withoutX2(String str) {
        int strLength = str.length() > 2 ? 2 : str.length();

        String firstTwoChars = str.substring(0,strLength);
        if (firstTwoChars.contains("x")) {
            str = firstTwoChars.replaceAll("x", "") + str.substring(strLength);
        }

        return str;
    }
}
