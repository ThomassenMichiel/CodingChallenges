package codingbat.string2;


public class SameStarChar {
    public boolean sameStarChar(String str) {
        return java.util.stream.IntStream.range(0,str.length()-2)
                .filter(i -> str.substring(i,i+3).matches(".\\*."))
                .allMatch(i -> str.charAt(i) == str.charAt(i+2));
    }
}
