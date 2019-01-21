package codewars.kyu7;

public class PaperFolder {
    public static Long fold(Double distance) {
        double paperThickness = 0.0001;
        long count = 0;
        while (paperThickness < distance) {
            paperThickness *= 2;
            count++;
        }
        return count;
    }
}