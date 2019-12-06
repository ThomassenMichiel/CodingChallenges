package codingbat.string2;

public class RepeatFront {
    public String repeatFront(String str, int n) {
        return java.util.stream.IntStream.iterate(n, i -> i - 1)
                .limit(n)
                .mapToObj(s -> str.substring(0, s))
                .collect(java.util.stream.Collectors.joining());
    }
}
