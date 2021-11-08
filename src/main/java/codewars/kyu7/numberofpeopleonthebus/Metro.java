package codewars.kyu7.numberofpeopleonthebus;

import java.util.ArrayList;

/**
 * url: https://www.codewars.com/kata/5648b12ce68d9daa6b000099
 */
class Metro {
    
    public static int countPassengers(ArrayList<int[]> stops) {
        int amountOfPeople = 0;
        for (int[] stop : stops) {
            amountOfPeople += stop[0] - stop[1];
        }
        return amountOfPeople;
    }
}
