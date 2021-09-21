package codewars.kyu7.allinclusive;

import java.util.ArrayList;
import java.util.List;

/**
 * url: https://www.codewars.com/kata/5700c9acc1555755be00027e
 */
public class Rotations {
    
    public static boolean containAllRots(String strng, List<String> arr) {
        if (strng.isEmpty()) {
            return true;
        }
        List<String> rotates = new ArrayList<>(strng.length());
        for (int i = 0; i < strng.length(); i++) {
            strng = rotate(strng);
            rotates.add(strng);
        }
        return arr.containsAll(rotates);
    }
    
    private static String rotate(String s) {
        return s.substring(s.length()-1) + s.substring(0,s.length()-1);
    }
}
