package codewars.kyu7;

public class GetMiddleCharacter {
    public static void main(String[] args) {
        System.out.println(getMiddle("test"));
        System.out.println(getMiddle("testing"));
        System.out.println(getMiddle("middle"));
        System.out.println(getMiddle("A"));
    }

    private static String getMiddle(String word) {
        return word.length()%2 == 1 ? "" + word.charAt(word.length()/2) : "" + word.charAt(word.length()/2-1) + word.charAt(word.length()/2);
    }
}
