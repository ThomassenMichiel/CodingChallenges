package codewars.kyu4;

import java.time.LocalDateTime;
import java.util.*;

public class TimeFormatter {

    public static String formatDuration(int seconds) {
        if (seconds == 0) {
            return "now";
        }

        LocalDateTime localTime = LocalDateTime.MIN.plusSeconds(seconds);
        LinkedHashMap<String, Integer> timeValues = new LinkedHashMap<>();
        timeValues.put("day", localTime.getDayOfYear() - 1);
        timeValues.put("hour", localTime.getHour());
        timeValues.put("minute", localTime.getMinute());
        timeValues.put("second", localTime.getSecond());

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