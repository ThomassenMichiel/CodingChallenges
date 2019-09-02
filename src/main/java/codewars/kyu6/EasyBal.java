package codewars.kyu6;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class EasyBal {
    private static String test = "" +
            "1000.00 " +
            "125 Market 125.45 " +
            "126 Hardware 34.95 " +
            "127 Video 7.45 " +
            "128 Book 14.32 " +
            "129 Gasoline 16.10 ";
    
    private static String second = "1000.00!=\n" +
            "125 Market !=:125.45\n" +
            "126 Hardware =34.95\n" +
            "127 Video! 7.45\n" +
            "128 Book :14.32\n" +
            "129 Gasoline ::16.10";
    
    public static void main(String[] args) {
//        System.out.println(balance(second));
        balance(second);
    }
    
    public static String balance(String book) {
        String escapedIllegalChars = book.replaceAll("[^0-9a-zA-Z. \r]", "");
        String[] filteredBookArray = escapedIllegalChars.replaceAll("(\\r\\n|\\r|\\n)", " ").split(" ");
//        .split(" ");
        
    
        /*for (String s : filteredBookArray) {
            System.out.println(s);
        }*/
    
        int size = filteredBookArray.length;
        int skip = 3;
        int limit = size / skip + Math.min(size % skip, 0);
    
        IntStream.iterate(3, i -> i + skip)
                .limit(limit)
                .mapToObj(i -> filteredBookArray[i])
//                .mapToDouble(Double::new)
                .forEach(System.out::println);
        
        /*double[] budgetStream = IntStream.iterate(3, i -> i + skip)
                .limit(limit)
                .mapToObj(i -> filteredBookArray[i])
                .mapToDouble(Double::new).toArray();
    
        double totalExpense = Arrays.stream(budgetStream).sum();
        OptionalDouble averageExpense = Arrays.stream(budgetStream).average();*/
    
        String filteredBookString = String.join("\n", filteredBookArray);
        /*filteredBookString += "Total expense  " + totalExpense;
        filteredBookString += "Average expense  " + averageExpense.orElse(0);*/
        
        return filteredBookString;
    }
}