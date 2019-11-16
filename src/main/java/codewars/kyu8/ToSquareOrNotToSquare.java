package codewars.kyu8;

import java.util.Arrays;

public class ToSquareOrNotToSquare {
    public static int[] squareOrSquareRoot(final int[] array) {
        return Arrays.stream(array).mapToDouble(i -> {
            double square = Math.sqrt(i);
            if ((square - Math.floor(square)) == 0) {
                return Math.sqrt(i);
            }
            return Math.pow(i,2);
        }).mapToInt(value -> (int) value)
        .toArray();
    }
}
