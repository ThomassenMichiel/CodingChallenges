package codewars.kyu8;

public class CharCount {
    public static int strCount(String str, char letter) {
        return (int) str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c == letter)
                .count();
    }
}
