package codewars.kyu5;

import java.util.Arrays;
import java.util.Objects;

public class DirReduction {
    private static boolean hasFoundOpposites = false;

    public static String[] dirReduc(String[] arr) {
        String[] mutatedArr = arr.clone();

        do {
            filterArray(mutatedArr);
            mutatedArr = removeNulls(mutatedArr);
        } while (hasFoundOpposites);

        return mutatedArr;
    }

    public static boolean opposite(String direction, String otherDirection) {
        switch (direction.toLowerCase()) {
            case "north": return otherDirection.equalsIgnoreCase("south");
            case "south": return otherDirection.equalsIgnoreCase("north");
            case "east": return otherDirection.equalsIgnoreCase("west");
            case "west": return otherDirection.equalsIgnoreCase("east");
        }
        return false;
    }

    public static String[] filterArray(String[] arr) {
        hasFoundOpposites = false;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != null && opposite(arr[i], arr[i+1])) {
                arr[i] = null;
                arr[i+1] = null;
                hasFoundOpposites = true;
            }
        }
        return arr;
    }

    public static String[] removeNulls(String[] arr) {
        return Arrays.stream(arr)
                .filter(Objects::nonNull)
                .toArray(String[]::new);
    }
}
