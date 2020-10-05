package codingbat.ap1;

public class MatchUp {
    public int matchUp(String[] a, String[] b) {
        return (int) java.util.stream.IntStream.range(0, a.length)
                .filter(i -> !a[i].isEmpty() && !b[i].isEmpty())
                .filter(i -> a[i].charAt(0) == b[i].charAt(0))
                .count();
    }
}
