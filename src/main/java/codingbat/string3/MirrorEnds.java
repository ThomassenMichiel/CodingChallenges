package codingbat.string3;

public class MirrorEnds {
    public String mirrorEnds(String string) {
        String result = "";
        for (int i = 0; i <= string.length(); i++) {
            for (int j = string.length(); j >= 0; j--) {
                if (string.substring(0,i).equals(new StringBuilder(string.substring(j)).reverse().toString())) {
                    result = string.substring(0,i);
                }
            }
        }
        return result;
    }
}
