package codewars.kyu7.sillyaddition;

import com.google.common.base.Strings;

/**
 * url: https://www.codewars.com/kata/5effa412233ac3002a9e471d/
 */
public class SillyAdditon {

    public static int add(int num1,int num2){
        String stringOfNum1 = String.valueOf(num1);
        String stringOfNum2 = String.valueOf(num2);
        int paddingLength = Math.max(stringOfNum1.length(), stringOfNum2.length());
        stringOfNum1 = Strings.padStart(stringOfNum1, paddingLength, '0');
        stringOfNum2 = Strings.padStart(stringOfNum2, paddingLength, '0');
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringOfNum1.length(); i++) {
            int addition = Character.getNumericValue(stringOfNum1.charAt(i)) + Character.getNumericValue(stringOfNum2.charAt(i));
            sb.append(addition);
        }
        return Integer.parseInt(sb.toString());
    }
}
