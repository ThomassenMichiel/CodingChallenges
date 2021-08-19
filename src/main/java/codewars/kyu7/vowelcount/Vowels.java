package codewars.kyu7.vowelcount;

public class Vowels {
    public static int getCount(String str) {
        return str.replaceAll("[^aeuio]", "").length();
    }
}
