package codewars.kyu6.breakcamelcase;

class Solution {
    public static String camelCase(String input) {
        return String.join(" ", input.split("(?=[A-Z])"));
    }
}
