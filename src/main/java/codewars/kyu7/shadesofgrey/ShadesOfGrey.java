package codewars.kyu7.shadesofgrey;

import com.google.common.base.Strings;

/**
 * url: https://www.codewars.com/kata/54d22119beeaaaf663000024
 */
public class ShadesOfGrey {
    static String[] shadesOfGrey(int num) {
        if (num < 1) {
            return new String[0];
        }
        if (num > 254) {
            num = 254;
        }
        String[] result = new String[num];
        for (int i = 1;  i <= num && i <= 256; i++) {
            result[i-1] = String.format("#%s", Strings.padStart(Integer.toHexString(i), 2, '0').repeat(3));
        }
        return result;
    }
}
