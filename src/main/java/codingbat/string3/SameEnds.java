package codingbat.string3;

public class SameEnds {
    /**
     * http://gregorulm.com/codingbat-java-string-3-part-ii/
     *
     * @param string the string to check against
     * @return the longest substring that doesn't overlap from both ends
     */
    public String sameEnds(String string) {
        String longestSubstring = "";
        for (int i = 0; i <= string.length() / 2; i++) {
            for (int j = string.length() / 2; j < string.length(); j++) {
                if (string.substring(0,i).equals(string.substring(j))) {
                    longestSubstring = string.substring(0,i);
                }
            }
        }
        return longestSubstring;
    }
}
