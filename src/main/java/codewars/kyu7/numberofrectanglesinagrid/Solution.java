package codewars.kyu7.numberofrectanglesinagrid;

/**
 * url: https://www.codewars.com/kata/556cebcf7c58da564a000045/
 */
public class Solution {
    
    public static int numberOfRectangles(int m, int n) {
        return (m * n * (n + 1) * (m + 1)) / 4;
    }
    
}
