package codewars.kyu7.enummagic1;

import java.util.Arrays;
import java.util.function.IntPredicate;

/**
 * url: https://www.codewars.com/kata/54598d1fcbae2ae05200112c
 */
public class Solution{
    public static boolean all(int[] list, IntPredicate predicate){
        return Arrays.stream(list).allMatch(predicate);
    }
}
