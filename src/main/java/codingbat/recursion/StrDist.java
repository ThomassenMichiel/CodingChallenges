package codingbat.recursion;

public class StrDist {
    public int strDist(String str, String sub) {
        if (str.startsWith(sub) && sub.endsWith(sub)) {
            return str.length();
        }
        if (!str.startsWith(sub)) {
            return strDist(str.substring(1),sub);
        }
        if (!str.endsWith(sub)) {
            return strDist(str.substring(str.length()-1),sub);
        }
        return 0;
    }
}
