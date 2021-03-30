package codewars.kyu7.reversenumber;

/**
 * url: https://www.codewars.com/kata/555bfd6f9f9f52680f0000c5
 */
public class ReverseNumber {
    
    public static int reverse(int number) {
        int reverseNumber = 0;
        while (Math.abs(number) > 0) {
            reverseNumber *= 10;
            reverseNumber += number % 10;
            number /= 10;
        }
        return reverseNumber;
    }
    
}
