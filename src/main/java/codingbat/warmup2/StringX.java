package codingbat.warmup2;

public class StringX {
    public static void main(String[] args) {
        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xabxxxcdx"));
    }

    public static String stringX(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.charAt(0) + str.substring(1,str.length()-1).replaceAll("x","") + str.charAt(str.length()-1);
    }
}
