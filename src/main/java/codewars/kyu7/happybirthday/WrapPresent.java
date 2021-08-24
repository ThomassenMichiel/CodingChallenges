package codewars.kyu7.happybirthday;

/**
 * url: https://www.codewars.com/kata/5d65fbdfb96e1800282b5ee0
 */
public class WrapPresent {
    
    public static int wrap(int height, int width, int length) {
        int hw = height * width;
        int hl = height * length;
        int wl = width * length;
        int totalLength = 0;
        if (hw > hl && hw > wl) {
            totalLength = getTotalLength(height, width, length);
        } else if (hl > hw && hl > wl) {
            totalLength = getTotalLength(height, length, width);
        } else {
            totalLength = getTotalLength(width, length, height);
        }
        return totalLength;
    }
    
    private static int getTotalLength(int height, int width, int length) {
        int totalLength = length * 4;
        totalLength += (height + width) * 2 + 20;
        return totalLength;
    }
}
