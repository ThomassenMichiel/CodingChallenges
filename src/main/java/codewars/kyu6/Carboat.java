package codewars.kyu6;

public class Carboat {
	public static void main(String[] args) {
		System.out.println(howmuch(0,100));
	}
	
	public static String howmuch(int m, int n) {
		/*for (int i = 0; i < 100; i++) {
			System.out.println(37 - i * 5);
		}*/
		for (int i = m; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int k = i - j * 5;
				if (k > 0) {
					System.out.println(i + "\t" + j + "\t" + k);
				}
			}
		}
		return "";
	}
}