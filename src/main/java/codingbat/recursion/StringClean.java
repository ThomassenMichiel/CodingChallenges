package codingbat.recursion;

public class StringClean {
    public String stringClean(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            str = stringClean(str.substring(1));
        }
        return str.charAt(0) + stringClean(str.substring(1));
    }
}
