package codewars.kyu8;

public class AlternatingCase {
    
    public static String toAlternativeString(String string) {
        StringBuilder sb = new StringBuilder(string);
        for (int i = 0, j = i + 1; i < sb.length(); i++, j++) {
            if (sb.charAt(i) >= 97) {
                sb.replace(i,j,string.substring(i,j).toUpperCase());
            } else {
                sb.replace(i,j,string.substring(i,j).toLowerCase());
            }
        }
        return sb.toString();
    }
}
