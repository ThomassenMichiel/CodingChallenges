package codewars.kyu7.maximumlengthdifference;

/**
 * url: https://www.codewars.com/kata/5663f5305102699bad000056
 */
class MaxDiffLength {
    
    public static int mxdiflg(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0) {
            return -1;
        }
        
        int maxDifference = Integer.MIN_VALUE;
    
        for (String s1 : a1) {
            for (String s2 : a2) {
                maxDifference = Math.max(maxDifference, Math.abs(s1.length() - s2.length()));
            }
        }
        
        return maxDifference;
    }
}
