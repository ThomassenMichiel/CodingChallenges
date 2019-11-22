package codingbat.string2;

public class CountHi {
    public static int countHi(String str) {
        return (int) java.util.stream.IntStream.range(0, str.length() - 1)
                .mapToObj(i -> String.valueOf(str.charAt(i)) + str.charAt(i + 1))
                .filter(s -> s.equals("hi"))
                .count();
    }
}
