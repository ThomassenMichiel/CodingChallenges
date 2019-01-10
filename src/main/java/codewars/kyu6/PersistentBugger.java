package codewars.kyu6;

import java.util.stream.IntStream;

public class PersistentBugger {
    public static void main(String[] args) {
        System.out.println(persistence(39));
        System.out.println(persistence(999));
        System.out.println(persistence(4));
    }

    private static int persistence(long n) {
        if (n < 10) {
            return 0;
        }

        char[] individualNumbers = String.valueOf(n).toCharArray();
        int countOfTimesToSingleDigit = 0;
        int resultOfAllNumbers = 0;
        boolean isSingleDigit = false;

        while (!isSingleDigit) {
            resultOfAllNumbers = Character.getNumericValue(individualNumbers[0]);
            for (int i = 1; i < individualNumbers.length; i++) {
                resultOfAllNumbers *= Character.getNumericValue(individualNumbers[i]);
            }
            if (resultOfAllNumbers < 10) {
                isSingleDigit = true;
            }
            individualNumbers = String.valueOf(resultOfAllNumbers).toCharArray();
            countOfTimesToSingleDigit++;
        }

        return countOfTimesToSingleDigit;
    }
}
