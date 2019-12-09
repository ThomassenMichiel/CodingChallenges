package codingbat.string3;

public class EqualIsNot {
    public boolean equalIsNot(String str) {
        long is = java.util.stream.IntStream.range(0, str.length()-1)
                .mapToObj(i -> str.substring(i, i + 2))
                .filter(s -> s.equals("is"))
                .count();
        long not = java.util.stream.IntStream.range(0, str.length()-2)
                .mapToObj(i -> str.substring(i, i + 3))
                .filter(s -> s.equals("not"))
                .count();
        return is == not;
    }
}
