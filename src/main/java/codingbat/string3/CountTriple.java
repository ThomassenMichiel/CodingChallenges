package codingbat.string3;

public class CountTriple {
    public int countTriple(String str) {
        return (int) java.util.stream.IntStream.range(0,str.length()-2)
                .mapToObj(i -> str.substring(i,i+3))
                .filter(s -> s.charAt(0) == s.charAt(1))
                .filter(s -> s.charAt(0) == s.charAt(2))
                .filter(s -> s.charAt(1) == s.charAt(2))
                .count();
    }
}
