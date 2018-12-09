package codingbat.logic1;

public class AlarmClock {
    public static void main(String[] args) {
        System.out.println(alarmClock(1, false));
        System.out.println(alarmClock(5, false));
        System.out.println(alarmClock(0, false));
    }

    public static String alarmClock(int day, boolean vacation) {
        if (!vacation && day > 0 && day < 6) {
            return "7:00";
        } else if ((vacation && day > 0 && day < 6) || (!vacation && (day == 0 || day == 6))) {
            return "10:00";
        } else {
            return "off";
        }


    }
}
