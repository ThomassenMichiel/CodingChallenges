package codewars.kyu7;

public class BattleOfTheCharacters {
    public static void main(String[] args) {
        System.out.println(battle("ONE","TWO"));
        System.out.println(battle("ONE","NEO"));
    }
    public static String battle(final String x, final String y) {
        int xAsInt = x.chars().map(xIntChar -> xIntChar - 64).sum();
        int yAsInt = y.chars().map(yIntChar -> yIntChar - 64).sum();
        if (xAsInt > yAsInt) {
            return x;
        } else if (xAsInt < yAsInt) {
            return y;
        }
        return "Tie!";
    }
}