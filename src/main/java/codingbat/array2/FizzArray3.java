package codingbat.array2;


public class FizzArray3 {
    public int[] fizzArray3(int start, int end) {
        return java.util.stream.IntStream.range(start, end).toArray();
    }
}
