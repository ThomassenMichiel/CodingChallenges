package codewars.kyu7.maxproduct;

/**
 * url: https://www.codewars.com/kata/5a4138acf28b82aa43000117
 */
public class MaxProduct {
    public int adjacentElementsProduct(int[] array) {
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 1; i < array.length; i++) {
            maxProduct = Math.max(maxProduct, array[i - 1] * array[i]);
        }
        return maxProduct;
    }
}
