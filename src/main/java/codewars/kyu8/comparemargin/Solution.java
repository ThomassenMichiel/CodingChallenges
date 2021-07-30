package codewars.kyu8.comparemargin;

public class Solution {

    public static int closeCompare(double a, double b) {
        return closeCompare(a, b, 0);
    }

    public static int closeCompare(double a, double b, double margin) {
        if (a == b || Math.abs(a - b) <= margin) {
            return 0;
        }
        return a < b ? -1 : 1;
    }
}