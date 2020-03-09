package codingbat.recursion;

public class Count11 {
    public int count11(String str) {
        if (str.length() < 2) {
            return 0;
        }
        int count = 0;
        if (str.substring(0,2).equals("11")) {
            count++;
            return count + count11(str.substring(2));
        }
        return count + count11(str.substring(1));
    }
}
