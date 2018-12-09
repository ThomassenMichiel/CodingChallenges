package codingbat.logic1;

public class CaughtSpeeding {
    public static void main(String[] args) {
        System.out.println(caughtSpeeding(60,false));
        System.out.println(caughtSpeeding(65,false));
        System.out.println(caughtSpeeding(65,true));
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        int noTicket = isBirthday ? 65 : 60;
        int smallTicket = isBirthday ? 85 : 80;

        if (speed <= noTicket) {
            return 0;
        }

        if (speed <= smallTicket) {
            return 1;
        }

        return 2;
    }
}
