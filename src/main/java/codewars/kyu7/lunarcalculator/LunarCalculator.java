package codewars.kyu7.lunarcalculator;

import java.util.Arrays;

/**
 * url: https://www.codewars.com/kata/5c4b5f06b1fd9b3fec8cb03e/train/java
 */
public class LunarCalculator {
    
    public static long add(long number1, long number2) {
        long[] number1Array = Arrays.stream(String.valueOf(number1).split("")).mapToLong(Long::valueOf).toArray();
        long[] number2Array = Arrays.stream(String.valueOf(number2).split("")).mapToLong(Long::valueOf).toArray();
        long[] resultArray = new long[(int) Math.max(number1Array.length, number2Array.length)];
        
        if (number1Array.length > number2Array.length) {
            long[] tempArray = new long[number1Array.length];
            System.arraycopy(number2Array, 0, tempArray, number1Array.length - number2Array.length, number2Array.length);
            number2Array = tempArray;
        } else if (number1Array.length < number2Array.length) {
            long[] tempArray = new long[number2Array.length];
            System.arraycopy(number1Array, 0, tempArray, number2Array.length - number1Array.length, number1Array.length);
            number1Array = tempArray;
        }
        
        
        for (int i = number1Array.length - 1; i >= 0; i--) {
            resultArray[i] = Math.max(number1Array[i], number2Array[i]);
        }
        
        
        String result = "";
        for (long l : resultArray) {
            result += l;
        }
        return Long.parseLong(result);
    }
}
