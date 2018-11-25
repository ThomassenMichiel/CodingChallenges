package codingbat.string1;

public class StartWord {
    public static void main(String[] args) {
        System.out.println(startWord("hippo", "hi"));
        System.out.println(startWord("hippo", "xip"));
        System.out.println(startWord("hippo", "i"));
        System.out.println(startWord("hip", "zig"));
    }

    public static String startWord(String str, String word) {
        if (str.startsWith(word) || str.startsWith(word.substring(1),1)) {
            return str.substring(0,word.length());
        }
        return "";
    }
}
