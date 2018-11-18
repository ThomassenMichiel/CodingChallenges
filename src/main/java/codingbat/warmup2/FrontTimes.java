package codingbat.warmup2;

public class FrontTimes {
    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 2));
        System.out.println(frontTimes("Chocolate", 3));
        System.out.println(frontTimes("Abc", 3));
    }

    public static String frontTimes(String str, int n) {
        String tempStr = "";
        if (str.length() > 2) {
            str = str.substring(0, 3);
        }
        for (int i = 0; i < n; i++) {
            tempStr += str;
        }
        return tempStr;
    }
}
