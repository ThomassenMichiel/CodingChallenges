package codewars.kyu6;

public class DirReduction {
    public static void main(String[] args) {
        for (String s : dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"})) {
            System.out.println(s);
        }
    }
    public static String[] dirReduc(String[] arr) {
        String currentDirection = "";
        int arrayNullCount = 0;
        for (int i = 0; i < arr.length-1; i++) {
            currentDirection = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                String nextDirection = arr[j];
                if (currentDirection != null && nextDirection!= null && ( currentDirection.equals("NORTH") && nextDirection.equals("SOUTH") ||
                        currentDirection.equals("SOUTH") && nextDirection.equals("NORTH") ||
                        currentDirection.equals("EAST") && nextDirection.equals("WEST") ||
                        currentDirection.equals("WEST") && nextDirection.equals("EAST")
                )) {
                    arr[i] = null;
                    arr[j] = null;
                    arrayNullCount += 2;
                    break;
                }
            }
        }
        String[] finalDirections = new String[arr.length - arrayNullCount];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                finalDirections[j++] = arr[i];
            }
        }
        return finalDirections;
    }
}
