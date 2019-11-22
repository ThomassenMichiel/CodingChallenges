package codingbat.logic2;

public class MakeChocolate {
    public static void main(String[] args) {
        System.out.println(makeChocolate(4, 1, 10));
    }
    
    public static int makeChocolate(int small, int big, int goal) {
        if (small + big * 5 < goal || goal % 5 > small) {
            return -1;
        } else if (big * 5 > goal) {
            return goal % 5;
        } else {
            return goal - big * 5;
        }
    }
}
