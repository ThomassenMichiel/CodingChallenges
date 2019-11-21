package codingbat.string2;

public class RepeatEnd {
    public String repeatEnd(String str, int n) {
        return java.util.stream.IntStream.range(0,n)
                .mapToObj(s -> str.substring(str.length()-n))
                .collect(java.util.stream.Collectors.joining());
    }
}
