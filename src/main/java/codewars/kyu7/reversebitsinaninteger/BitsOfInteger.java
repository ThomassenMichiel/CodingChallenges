package codewars.kyu7.reversebitsinaninteger;

/**
 * https://www.codewars.com/kata/5959ec605595565f5c00002b
 */
public class BitsOfInteger {
    public static int reverse_bits(int n) {
        return Integer.parseInt(new StringBuilder(Integer.toBinaryString(n)).reverse().toString(), 2);
    }
}
