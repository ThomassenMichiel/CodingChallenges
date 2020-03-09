package codingbat.recursion;

public class CountAbc {
    public int countAbc(String str) {
        if (str.length() < 3) {
            return 0;
        }
        int count = 0;
        if (str.substring(0,3).matches("ab[ac]")) {
            count++;
        }
        return count + countAbc(str.substring(1));
    }
}
