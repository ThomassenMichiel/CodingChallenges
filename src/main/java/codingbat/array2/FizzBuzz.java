package codingbat.array2;

public class FizzBuzz {
    public String[] fizzBuzz(int start, int end) {
        String[] fizzBuzz = new String[end - start];
        for (int i = start, j = 0; i < end; i++, j++) {
            if (i % 15 == 0) {
                fizzBuzz[j] = "FizzBuzz";
            } else if (i % 3 == 0) {
                fizzBuzz[j] = "Fizz";
            } else if (i % 5 == 0) {
                fizzBuzz[j] = "Buzz";
            } else {
                fizzBuzz[j] = String.valueOf(i);
            }
        }
        return fizzBuzz;
    }
}
