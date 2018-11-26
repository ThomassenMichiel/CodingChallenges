package codingbat.logic1;

public class SquirrelPlay {
    public static void main(String[] args) {
        System.out.println(squirrelPlay(70,false));
        System.out.println(squirrelPlay(95,false));
        System.out.println(squirrelPlay(95,true));
    }

    public static boolean squirrelPlay(int temp, boolean isSummer) {
        return temp >= 60 && temp <= (isSummer ? 100 : 90);
    }
}
