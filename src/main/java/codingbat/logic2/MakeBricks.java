package codingbat.logic2;

public class MakeBricks {
    public static void main(String[] args) {
        System.out.println(makeBricks(3,1,8));
        System.out.println(makeBricks(3,1,9));
        System.out.println(makeBricks(3,2,9));
        System.out.println(makeBricks(3,2,10));
    }

    public static boolean makeBricks(int small, int big, int goal) {
        // not efficient but idgaf atm, its still not a loop!
        big *= 5;

        if (big == goal || big + small == goal) {
            return true;
        }

        if (big + small < goal) {
            return false;
        }

        if (big > goal) {
            big -= 5;
            return big + small >= goal;
        }

        return false;
    }
}
