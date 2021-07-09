package codewars.kyu6.htmdynamiccolorstringgeneration;

import java.util.Random;

/**
 * url: https://www.codewars.com/kata/56f1c6034d0c330e4a001059/train/java
 */
public class GenerateColorRGB {
    
    public static String generateColor(Random r) {
        return String.format("#%1$6s", Integer.toHexString(r.nextInt(16777215))).replaceAll(" ", "0");
    }
    
}
