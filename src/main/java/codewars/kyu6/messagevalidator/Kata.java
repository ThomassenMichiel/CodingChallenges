package codewars.kyu6.messagevalidator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kata {
    
    public static boolean isAValidMessage(String message) {
        if (message.isBlank() || "0".equals(message)) {
            return true;
        }
        if (!Character.isDigit(message.charAt(0)) || Character.isDigit(message.charAt(message.length()-1))) {
            return false;
        }
        Matcher matcher = Pattern.compile("\\d+|\\D+").matcher(message);
        List<String> list = new ArrayList<>();
        while (matcher.find()) {
            list.add(matcher.group());
        }
        if (list.size() % 2 != 0) {
            return false;
        }
        for (int i = 0; i < list.size(); i += 2) {
            if (Integer.parseInt(list.get(i)) != list.get(i + 1).length()) {
                return false;
            }
        }
        return true;
    }
}
