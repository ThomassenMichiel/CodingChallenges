package codewars.kyu7.shifterwords;

import java.util.HashSet;
import java.util.regex.Pattern;

/**
 * url: https://www.codewars.com/kata/603b2bb1c7646d000f900083
 */
public class Shifter{
    public static int count(String st){
        Pattern pattern = Pattern.compile("[HINOSXZMW]+");
        HashSet<String> matches = new HashSet<>();
        for (String s : st.split(" ")) {
            if (pattern.matcher(s).matches()) {
                matches.add(s);
            }
        }
        return matches.size();
    }
}
