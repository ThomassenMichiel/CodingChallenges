package codingbat.array2;


public class FizzArray {
    public int[] fizzArray(int n) {
        return java.util.stream.IntStream.range(0,n).toArray();
    }
}
