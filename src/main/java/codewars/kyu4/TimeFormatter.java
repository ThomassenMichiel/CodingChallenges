package codewars.kyu4;

import java.time.LocalDateTime;
import java.util.*;


public class TimeFormatter {
    public static void main(String[] args) {
        System.out.println(formatDuration(80808));
        System.out.println(formatDuration((365*24*3600)+80808));
    }

    public static String formatDuration(int seconds) {
        if (seconds == 0) {
            return "now";
        }

//        LocalDateTime localDateTime = LocalDateTime.MIN.plusSeconds(seconds);

        int years = seconds / (365 * 24 * 3600);
        seconds -= years * 365 * 24 * 3600;
        int days = seconds / (24 * 3600);
        seconds -= days * 24 * 3600;
        int hours = seconds / (3600);
        seconds -= hours * 3600;
        int minutes = seconds / 60;
        seconds -= minutes * 60;
        int remainingSeconds = seconds % 60;
        LinkedHashMap<String, Integer> timeValues = new LinkedHashMap<>();
        timeValues.put("year", years);
        timeValues.put("day", days);
        timeValues.put("hour", hours);
        timeValues.put("minute", minutes);
        timeValues.put("second", remainingSeconds);

        if (timeValues.get("year") == 0) {
            timeValues.remove("year");
        }
        if (timeValues.get("day") == 0) {
            timeValues.remove("day");
        }
        if (timeValues.get("hour") == 0) {
            timeValues.remove("hour");
        }
        if (timeValues.get("minute") == 0) {
            timeValues.remove("minute");
        }
        if (timeValues.get("second") == 0) {
            timeValues.remove("second");
        }

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, Integer> entry : timeValues.entrySet()) {
            String unit = " " + entry.getKey();
            if (entry.getValue() > 1) {
                unit += "s";
            }

            sb.append(entry.getValue())
                    .append(unit)
                    .append(", ");
        }

        sb.deleteCharAt(sb.lastIndexOf(","));

        if(timeValues.size() > 1) {
            sb.replace(sb.lastIndexOf(", "),sb.lastIndexOf(", ") + 2," and ");
        }

        return sb.toString().trim();
    }
}