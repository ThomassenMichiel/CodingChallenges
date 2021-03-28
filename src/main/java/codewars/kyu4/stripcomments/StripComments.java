package codewars.kyu4.stripcomments;

/**
 * url: https://www.codewars.com/kata/51c8e37cee245da6b40000bd/
 */
public class StripComments {
    
    public static String stripComments(String text, String[] commentSymbols) {
        StringBuilder sb = new StringBuilder();
        for (String s : text.split("\n")) {
            for (String commentSymbol : commentSymbols) {
                int index = s.indexOf(commentSymbol);
                if (index != -1) {
                    s = s.substring(0, index).stripTrailing();
                    break;
                }
            }
            sb.append(s.stripTrailing());
            sb.append("\n");
        }
        return sb.substring(0, sb.toString().lastIndexOf("\n"));
        
    }
}
