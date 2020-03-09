package codingbat.recursion;

public class CountHi2 {
    public int countHi2(String str) {
        if (str.length() < 3) {
            return 0;
        }
        
        int count = 0;
        if (str.substring(0,3).matches("(?!x)[^x]hi")) {
            count++;
        }
        return count + countHi2(str.substring(1));
    }
}
