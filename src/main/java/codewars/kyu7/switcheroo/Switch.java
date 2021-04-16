package codewars.kyu7.switcheroo;

/**
 * url: https://www.codewars.com/kata/57f759bb664021a30300007d
 */
public class Switch {
    public static String switcheroo(String x){
        x = x.replace('a', 'x');
        x = x.replace('b', 'a');
        x = x.replace('x', 'b');
        return x;
    }
}
