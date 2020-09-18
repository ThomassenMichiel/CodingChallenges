package codingbat.array2;


public class FizzArray2 {
    public String[] fizzArray2(int n) {
        return java.util.stream.IntStream.range(0,n).mapToObj(String::valueOf).toArray(String[]::new);
    }
}
