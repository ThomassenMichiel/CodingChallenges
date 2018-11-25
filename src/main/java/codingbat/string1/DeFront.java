package codingbat.string1;

public class DeFront {
    public static void main(String[] args) {
        System.out.println(deFront("Hello"));
        System.out.println(deFront("java"));
        System.out.println(deFront("away"));
        System.out.println(deFront("ab"));
    }

    public static String deFront(String str) {
        String deFrontResult = "";
        if (str.charAt(0) == 'a') {
            deFrontResult += 'a';
        }
        if (str.charAt(1) == 'b') {
            deFrontResult += 'b';
        }
        return deFrontResult + str.substring(2);
    }
}
