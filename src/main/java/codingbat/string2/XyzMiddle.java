package codingbat.string2;

public class XyzMiddle {
    public boolean xyzMiddle(String str) {
        if (str.length() < 3) {
            return false;
        }
        int strLength = str.length() / 2 - 2;
        int endLength = str.length() / 2 - 1;
        
        if (str.length() % 2 == 0) {
            return str.substring(strLength, strLength + 3).equals("xyz") ||
                    str.substring(endLength, endLength + 3).equals("xyz");
        }
        return str.substring(endLength, endLength + 3).equals("xyz");
    }
    
}
