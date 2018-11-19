package codingbat.string1;

public class FirstTwo {
    public static void main(String[] args) {
        System.out.println(firstTwo("Hello"));
        System.out.println(firstTwo("abcdefg"));
        System.out.println(firstTwo("ab"));
        System.out.println(firstTwo(""));
        System.out.println(firstTwo("X"));
    }

    public static String firstTwo(String str) {
        if (str.length() < 3) {
            return str;
        }

        return str.substring(0,2);
    }
}
