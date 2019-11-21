package codingbat.string2;

public class MixString {
    
    public static String mixString(String a, String b) {
        return java.util.stream.IntStream.range(0, Math.max(a.length(), b.length()))
                .mapToObj(i -> {
                    String aChar = i < a.length() ? String.valueOf(a.charAt(i)) : "";
                    String bChar = i < b.length() ? String.valueOf(b.charAt(i)) : "";
                    return aChar + bChar;
                }).collect(java.util.stream.Collectors.joining());
    }
}
