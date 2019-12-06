package codingbat.string2;

public class PlusOut {
    public String plusOut(String str, String word) {
        return str.replaceAll(String.format("(?<!(?=%s).{0,%d}).",java.util.regex.Pattern.quote(word),word.length()-1),"+");
    }
}
