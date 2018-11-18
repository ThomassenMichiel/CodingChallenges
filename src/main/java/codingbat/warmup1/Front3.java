package codingbat.warmup1;

public class Front3 {
    public static void main(String[] args) {
        String str = "Java";
        System.out.println(front3(str));
    }

    public static String front3(String str) {
        String sub = str.length() > 3 ? str.substring(0,3) : str;
        str = "";
        for (int i = 0; i < 3; i++) {
            str += sub;
        }
        return str;
    }
}
