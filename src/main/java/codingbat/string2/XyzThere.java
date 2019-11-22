package codingbat.string2;

public class XyzThere {
    public static boolean xyzThere(String str) {
        if (str.contains(".xyz")) {
            String xyzRemoved = str.substring(0,str.indexOf(".xyz")) + str.substring(str.indexOf(".xyz") + 4);
            return xyzThere(xyzRemoved);
        }
        return !str.contains(".xyz") && str.contains("xyz");
    }
}
