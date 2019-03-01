package codewars.kyu7;

public class MaxRotate {
    public static void main(String[] args) {
        System.out.println(maxRot(56789));
    }
    public static long maxRot (long n) {
        String longToString = String.valueOf(n);
        long biggestValue = n;
        for (int i = 0; i < longToString.toCharArray().length-1; i++) {
            longToString = switchDigits(longToString, i);
            biggestValue = Math.max(biggestValue, Long.valueOf(longToString));
        }
        return biggestValue;
    }

    public static String switchDigits(String number, int firstPos) {
        return number.substring(0, firstPos) + number.substring(firstPos + 1) + number.charAt(firstPos);
    }
}