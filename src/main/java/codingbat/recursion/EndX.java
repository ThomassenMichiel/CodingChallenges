package codingbat.recursion;

public class EndX {
    public String endX(String str) {
        if (str.isEmpty()) {
            return str;
        }
        if (str.startsWith("x")) {
            str = endX(str.substring(1)) + "x";
        }
        return str.substring(0,1) + endX(str.substring(1));
    }
}
