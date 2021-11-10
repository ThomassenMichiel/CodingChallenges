package codewars.kyu6.bitcounting;

/**
 * url: https://www.codewars.com/kata/526571aae218b8ee490006f4/solutions/java
 */
public class BitCounting {

	public static int countBits(int n){
		return Integer.toBinaryString(n).replace("0", "").length();
	}
	
}
