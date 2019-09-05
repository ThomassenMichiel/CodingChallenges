package codewars.kyu8;


import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata {
	
	public static void main(String[] args) {
		Arrays.stream(mergeArrays(new int[] { 1, 2, 3, 4, 5, 6 }, Kata.mergeArrays(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6 }))).forEach(System.out::println);
		Arrays.stream(mergeArrays(new int[]{2, 4, 6, 8}, Kata.mergeArrays(new int[]{2, 4, 8}, new int[]{2, 4, 6}))).forEach(System.out::println);
	}
	
	public static int[] mergeArrays(int[] first, int[] second) {
		return IntStream.concat(Arrays.stream(first),Arrays.stream(second))
				.distinct()
				.sorted()
				.toArray();
	}
}
