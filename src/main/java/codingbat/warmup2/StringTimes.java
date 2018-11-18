package codingbat.warmup2;

public class StringTimes {
    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 2));
        System.out.println(stringTimes("Hi", 3));
        System.out.println(stringTimes("Hi", 1));
    }

    public static String stringTimes(String str, int n) {
        String tempStr = "";
        for (int i = 0; i < n; i++) {
            tempStr += str;
        }
        return tempStr;
    }
}
