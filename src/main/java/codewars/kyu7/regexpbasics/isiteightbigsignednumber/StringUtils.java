package codewars.kyu7.regexpbasics.isiteightbigsignednumber;

public class StringUtils {
    public static boolean isSignedEightBitNumber(String s) {
        return s.matches("0|-?[1-9]|-?[1-9][0-9]|-?1[01][0-9]|-?12[0-7]|-128");
    }
}
