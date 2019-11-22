package codingbat.string2;

public class CountCode {
    public int countCode(String str) {
        return (int) java.util.stream.IntStream.range(0, str.length() - 3)
                .mapToObj(i -> str.substring(i,i+4))
                .filter(s -> s.matches("(co.e)"))
                .count();
    }
}
