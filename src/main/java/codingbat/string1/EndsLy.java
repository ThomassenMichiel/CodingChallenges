package codingbat.string1;

public class EndsLy {
    public static void main(String[] args) {
        System.out.println(endsLy("oddly"));
        System.out.println(endsLy("y"));
        System.out.println(endsLy("oddy"));
    }

    public static boolean endsLy(String str) {
        return str.endsWith("ly");
    }
}
