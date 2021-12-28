package codewars.kyu7.arrayseries.productofmaximumsofarray;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductOfMaximumsOfArray {
    @Test
    public void Return_Maximum_Product() {
        assertEquals(20, Solution.maxProduct(new int[]{4, 3, 5}, 2));
        assertEquals(720, Solution.maxProduct(new int[]{10, 8, 7, 9}, 3));
        assertEquals(288, Solution.maxProduct(new int[]{8, 6, 4, 6}, 3));
    }

    @Test
    public void Checks_Larger_Vector_Size() {
        assertEquals(9600, Solution.maxProduct(new int[]{10, 2, 3, 8, 1, 10, 4}, 5));
        assertEquals(247895375, Solution.maxProduct(new int[]{13, 12, -27, -302, 25, 37, 133, 155, -14}, 5));
    }

    @Test
    public void Checks_Negative_Values() {
        assertEquals(4, Solution.maxProduct(new int[]{-4, -27, -15, -6, -1}, 2));
        assertEquals(136, Solution.maxProduct(new int[]{-17, -8, -102, -309}, 2));
    }

    @Test
    public void Checks_Mixture_Values() {
        assertEquals(-30, Solution.maxProduct(new int[]{10, 3, -27, -1}, 3));
        assertEquals(-253344, Solution.maxProduct(new int[]{14, 29, -28, 39, -16, -48}, 4));
    }

    @Test
    public void randomTests() {
        assertEquals(-9223372036854775808L, Solution.maxProduct(new int[]{-99, -99, -99, -99, -98, -98, -97, -95, -93, -92, -92, -91, -91, -89, -86, -84, -83, -82, -79, -76, -76, -75, -74, -74, -70, -68, -68, -68, -66, -66, -65, -65, -61, -61, -60, -58, -57, -54, -52, -51, -48, -48, -46, -45, -44, -42, -41, -39, -37, -36, -35, -35, -35, -35, -33, -33, -32, -32, -31, -31, -31, -28, -28, -26, -25, -24, -23, -22, -21, -20, -18, -11, -11, -10, -5, -2, -2, 0, 4, 4, 7, 9, 11, 11, 11, 13, 14, 15, 16, 17, 17, 18, 18, 19, 23, 23, 26, 28, 29, 30, 30, 30, 30, 31, 32, 33, 35, 35, 35, 35, 37, 39, 40, 40, 41, 41, 41, 42, 43, 44, 45, 46, 47, 49, 51, 51, 55, 56, 56, 56, 58, 59, 62, 64, 67, 67, 67, 67, 69, 70, 71, 72, 73, 73, 74, 76, 78, 78, 80, 82, 85, 86, 86, 87, 88, 88, 89, 96, 96, 98, 98, 99, 100}, 58));
    }
}