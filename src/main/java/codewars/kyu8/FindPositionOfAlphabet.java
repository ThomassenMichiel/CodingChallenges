package codewars.kyu8;

public class FindPositionOfAlphabet {
    public static String position(char alphabet) {
        return String.format("Position of alphabet: %d", alphabet - 'a' + 1);
    }
}
