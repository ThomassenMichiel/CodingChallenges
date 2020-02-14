package codewars.kyu7;

public class AlphabeticalAddition {
    
    public static String addLetters(String... letters) {
        if (letters.length == 0) {
            return "z";
        }
        int count = 0;
        for (String letter : letters) {
            count += (int) letter.charAt(0) - '`';
        }
        if (count > 26) {
            count = count % 26;
        }
        return String.valueOf((char) ('`' + (char) count));
    }
    
}
