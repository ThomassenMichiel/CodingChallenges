package codingbat.string2;


public class WordEnds {
    public String wordEnds(String str, String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length()-word.length(); i++) {
            String substring = str.substring(i, i + word.length() + 1);
            if (substring.startsWith(word)) {
                sb.append(substring.charAt(word.length()));
            }
            if (substring.endsWith(word)) {
                sb.append(substring.charAt(0));
            }
        }
        return sb.toString();
    }
}
