package codewars.kyu7.goingtothecinema;

/**
 * url: https://www.codewars.com/kata/562f91ff6a8b77dfe900006e/
 */
public class Movie {

    public static int movie(int card, int ticket, double perc) {
        double totalCard = card;
        for (int i = 1; ; i++) {
            double totalTicket = ticket * i;
            totalCard += ticket * Math.pow( perc, i);
            if (Math.ceil(totalCard) < totalTicket) {
                return i;
            }
        }
    }
}