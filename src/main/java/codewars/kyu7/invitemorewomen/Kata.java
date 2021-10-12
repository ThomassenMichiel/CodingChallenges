package codewars.kyu7.invitemorewomen;

import java.util.Arrays;

/**
 * url: https://www.codewars.com/kata/58acfe4ae0201e1708000075
 */
public class Kata {
    public static boolean inviteMoreWomen(int[] l) {
        return Arrays.stream(l).sum() > 0;
    }
}
