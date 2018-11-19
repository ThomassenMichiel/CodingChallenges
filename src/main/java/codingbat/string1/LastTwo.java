package codingbat.string1;

public class LastTwo {
    public static void main(String[] args) {
        System.out.println(lastTwo("coding"));
        System.out.println(lastTwo("cat"));
        System.out.println(lastTwo("ab"));
    }

    public static String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }

        return str.substring(0,str.length()-2) + str.substring(str.length()-1) + str.substring(str.length()-2,str.length()-1);
    }
}
