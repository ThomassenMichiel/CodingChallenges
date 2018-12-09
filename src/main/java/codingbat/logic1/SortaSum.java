package codingbat.logic1;

public class SortaSum {
    public static void main(String[] args) {
        System.out.println(sortaSum(3,4));
        System.out.println(sortaSum(9,4));
        System.out.println(sortaSum(10,11));
    }

    public static int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum < 20) {
            return 20;
        }
        return sum;
    }
}
