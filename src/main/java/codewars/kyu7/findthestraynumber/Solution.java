package codewars.kyu7.findthestraynumber;

/**
 * url: https://www.codewars.com/kata/57f609022f4d534f05000024/
 */
class Solution {
    static int stray(int[] numbers) {
        int firstNumber = numbers[0];
        if (firstNumber != numbers[1] && firstNumber != numbers[2]) {
            return firstNumber;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (firstNumber != numbers[i]) {
                return numbers[i];
            }
        }
        return 0;
    }
}
