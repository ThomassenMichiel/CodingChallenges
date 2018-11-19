package codingbat.string1;

public class MiddleTwo {
    public static void main(String[] args) {
        System.out.println(middleTwo("string"));
        System.out.println(middleTwo("code"));
        System.out.println(middleTwo("practice"));
    }

    public static String middleTwo(String str) {
        int first = str.length()/2-1;
        int second = str.length()/2+1;
        return str.substring(first,second);
    }
}
