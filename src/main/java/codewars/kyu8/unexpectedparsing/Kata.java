package codewars.kyu8.unexpectedparsing;

import java.util.HashMap;
import java.util.Map;

public class Kata {

    public static HashMap<String, String> getStatus(boolean isBusy) {
        return new HashMap<>(Map.of("status", isBusy ? "busy" : "available"));
    }
}