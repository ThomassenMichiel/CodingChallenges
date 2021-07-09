package codewars.kyu5.phonedirectory;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * url: https://www.codewars.com/kata/56baeae7022c16dd7400086e/train/java
 */
class PhoneDir {
    
    public static String phone(String strng, String num) {
        Pattern telephonePattern = Pattern.compile("\\d{1,2}-\\d{3}-\\d{3}-\\d{4}");
        Pattern namePattern = Pattern.compile("(?<=<)(.+)(?=>)");
        String result = "";
        
        for (String s : strng.split("\n")) {
            Matcher nameMatcher = namePattern.matcher(s);
            Matcher telephoneMatcher = telephonePattern.matcher(s);
            if (nameMatcher.find() && telephoneMatcher.find() && telephoneMatcher.group().equals(num)) {
                if (!result.isEmpty()) {
                    return "Error => Too many people: " + num;
                }
                s = s.replace(telephoneMatcher.group(), "")
                        .replace(nameMatcher.group(), "")
                        .replaceAll("[^a-zA-Z0-9 .-]", " ")
                        .replaceAll("\\s+", " ")
                        .strip();
                result = String.format("Phone => %s, Name => %s, Address => %s", telephoneMatcher.group(), nameMatcher.group(), s);
            }
        }
        return result.isEmpty() ? "Error => Not found: " + num : result;
    }
}
