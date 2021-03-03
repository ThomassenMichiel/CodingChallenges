package codewars.kyu6.streetfighter2characterselection;

import java.util.ArrayList;
import java.util.List;

/**
 * url: https://www.codewars.com/kata/5853213063adbd1b9b0000be/
 */
public class Solution {
    public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves) {
        List<String> seenFighters = new ArrayList<>();
        int y = position[0];
        int x = position[1];
        for (String move : moves) {
            switch (move) {
                case "left": y = y == 0 ? 5 : y - 1; break;
                case "right": y = y == 5 ? 0 : y + 1; break;
                case "up": x = x == 0 ? 0 : x - 1; break;
                case "down": x = x == 1 ? 1 : x + 1; break;
            }
            seenFighters.add(fighters[x][y]);
        }
        return seenFighters.toArray(String[]::new);
    }
}
