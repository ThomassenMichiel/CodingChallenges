package codewars.kyu7;

public class Printer {
    public static void main(String[] args) {
        System.out.println(printerError("aabbccww"));
    }
    
    public static String printerError(String s) {
        long countOfErrors = s.chars()
                .filter(value -> value > 'm')
                .count();
        return countOfErrors + "/" + s.length();
    }
}