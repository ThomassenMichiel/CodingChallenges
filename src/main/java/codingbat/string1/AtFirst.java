package codingbat.string1;

public class AtFirst {
    public static void main(String[] args) {
        System.out.println(atFirst("hello"));
        System.out.println(atFirst("hi"));
        System.out.println(atFirst("h"));
    }

    public static String atFirst(String str) {
        StringBuilder sb = new StringBuilder("@@");
        for (int i = 0;i < str.length() && i < 2; i++) {
            sb.replace(i, i+1, str.substring(i, i + 1));
        }
        return sb.toString();
    }
}
