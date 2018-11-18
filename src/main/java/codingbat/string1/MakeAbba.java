package codingbat.string1;

public class MakeAbba {
    public static void main(String[] args) {
        System.out.println(makeAbba("Hi","Bye"));
    }

    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }
}
