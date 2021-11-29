package codewars.kyu7.friends;

/**
 * url: https://www.codewars.com/kata/5ad29cd95e8240dd85000b54
 */
public class Friends {
    public static int friends(int n) {
        return n > 2 ? (int) (Math.log(n - 1d) / Math.log(2)) : 0;
    }
}
