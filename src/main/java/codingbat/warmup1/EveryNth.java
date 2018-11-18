package codingbat.warmup1;

public class EveryNth {
    public static void main(String[] args) {
        System.out.println(everyNth("Miracle",2));
        System.out.println(everyNth("abcdefg",2));
        System.out.println(everyNth("abcdefg",3));
    }

    public static String everyNth(String str, int n) {
        String charHolder = "";
        for (int i = 0; i < str.length(); i += n) {
            charHolder += str.charAt(i);
        }
        return charHolder;
    }
}
