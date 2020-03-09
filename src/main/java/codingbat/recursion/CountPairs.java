package codingbat.recursion;

public class CountPairs {
    public int countPairs(String str) {
        if (str.length() < 3) {
            return 0;
        }
        int pairs = 0;
        if (str.charAt(0) == str.charAt(2)) {
            pairs++;
        }
        return pairs + countPairs(str.substring(1));
    }
}
