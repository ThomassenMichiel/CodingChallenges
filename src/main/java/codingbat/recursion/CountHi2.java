package codingbat.recursion;

public class CountHi2 {
    public int countHi2(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        if (str.startsWith("hi")) {
            return 1 + countHi2(str.substring(2));
        }
        if (str.length() > 2) {
            String substring = str.substring(0, 3);
            if (!substring.startsWith("x") && substring.contains("hi")) {
                return 1 + countHi2(str.substring(3));
            } else if (substring.startsWith("x") && substring.contains("hi")) {
                return countHi2(str.substring(3));
            }
        }
        return countHi2(str.substring(1));
    }
}
