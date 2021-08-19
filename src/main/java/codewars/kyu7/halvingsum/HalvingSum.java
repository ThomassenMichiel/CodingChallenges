package codewars.kyu7.halvingsum;

/**
 * url: https://www.codewars.com/kata/5a58d46cfd56cb4e8600009d
 */
public class HalvingSum {
    int halvingSum(int n) {
        int sum = n;
        do {
            sum += n / 2;
            n /= 2;
        } while (n > 1);
        return sum;
    }
}
