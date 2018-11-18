package codingbat.warmup1;

public class BackAround {
    public static void main(String[] args) {
        System.out.println(backAround("a"));
    }

    public static String backAround(String str) {
        return str.charAt(str.length()-1) + str + str.charAt(str.length()-1);
    }
}
