package codingbat.recursion;

public class ParenBit {
    public String parenBit(String str) {
        if (!str.startsWith("(")) {
            return parenBit(str.substring(1));
        }
        if (!str.endsWith(")")) {
            return parenBit(str.substring(0,str.length()-1));
        }
        return str;
    }
}
