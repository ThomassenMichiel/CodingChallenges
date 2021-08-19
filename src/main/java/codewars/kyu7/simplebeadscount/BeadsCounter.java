package codewars.kyu7.simplebeadscount;

/**
 * url: https://www.codewars.com/kata/58712dfa5c538b6fc7000569
 */
public class BeadsCounter {
    public static int countRedBeads(final int nBlue) {
        return nBlue <= 1 ? 0 : (nBlue - 1) * 2;
    }
}
