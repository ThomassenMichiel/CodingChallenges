package codingbat.recursion;

public class CountHi2 {
    public int countHi2(String str) {
        if (str.length() < 3) {
            return 0;
        }
        System.out.println("===================");
        int count = 0;
        if (str.substring(0,3).matches("(?!x)[^x]hi")) {
            count++;
        }
        System.out.println("=====================");
        System.out.println("=====================");
        System.out.println("=====================");
        System.out.println("=====================");
        return count + countHi2(str.substring(1));
    }
}
