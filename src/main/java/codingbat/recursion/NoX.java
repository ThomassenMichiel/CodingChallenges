package codingbat.recursion;

public class NoX {
    public String noX(String str) {
        if (str.contains("x")) {
            int index = str.indexOf('x');
            str = str.substring(0,index) + str.substring(index + 1);
            return noX(str);
        }
        return str;
    }
}
