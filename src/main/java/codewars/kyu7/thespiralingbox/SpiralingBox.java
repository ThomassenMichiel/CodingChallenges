package codewars.kyu7.thespiralingbox;

public class SpiralingBox {
    public static int[][] createBox(int width, int length) {
        // Put your code here.
        int[][] box = new int[length][width];
        int max = Math.min(width, length);
        for (int i = 0; i < max; i++) {
            for (int j = i; j < box.length - i; j++) {
                for (int k = i; k < box[j].length - i; k++) {
                    box[j][k] = ++box[j][k];
                }
            }
        }
        return box;
    }
}