package codewars.kyu7.pawndistance;

public class CodeWars {
    public static PawnDistance redKnight(int knight, long pawn) {
        if (pawn % 2 == 0 && knight == 0) {
            knight = 1;
        } else if (pawn % 2 == 0 && knight == 1) {
            knight = 0;
        }
        return new PawnDistance(knight != 0 ? "White" : "Black", pawn * 2);
    }
}
