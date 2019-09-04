package codewars.kyu8;

import java.util.List;

public class MixedSum {

 /*
  * Assume input will be only of Integer o String type
  */
	public int sum(List<?> mixed) {
		return mixed.stream()
				.map(String::valueOf)
				.mapToInt(Integer::valueOf)
				.sum();
	}
}
