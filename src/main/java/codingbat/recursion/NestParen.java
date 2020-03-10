package codingbat.recursion;

public class NestParen {
    public boolean nestParen(String str) {
        if (str.startsWith("(") && str.endsWith(")")) {
            return nestParen(str.substring(1,str.length()-1));
        }
        return str.isEmpty();
    }
}
