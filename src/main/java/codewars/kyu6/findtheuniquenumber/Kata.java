package codewars.kyu6.findtheuniquenumber;

/**
 * url: https://www.codewars.com/kata/585d7d5adb20cf33cb000235
 */
public class Kata {
    public static double findUniq(double[] arr) {
        for (int i = 0; i < arr.length-2; i++) {
            double first = arr[i];
            double second = arr[i+1];
            double third = arr[i+2];
            if (first != second && second != third) {
                return second;
            } else if (first == second && second != third ) {
                return third;
            } else if (first != second ) {
                return first;
            }
        }
        return 0d;
    }
}
