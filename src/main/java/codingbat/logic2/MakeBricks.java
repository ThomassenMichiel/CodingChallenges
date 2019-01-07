package codingbat.logic2;

public class MakeBricks {
    public static void main(String[] args) {
        /*System.out.println(makeBricks(3, 1, 8) + " (should be true)");
        System.out.println(makeBricks(3, 1, 9) + " (should be false)");
        System.out.println(makeBricks(3, 2, 10) + " (should be true)");
        System.out.println(makeBricks(3, 2, 8) + " (should be true)");
        System.out.println(makeBricks(3, 2, 9) + " (should be false)");
        System.out.println(makeBricks(6, 1, 11) + " (should be true)");
        System.out.println(makeBricks(6, 0, 11) + " (should be false)");
        System.out.println(makeBricks(1,4, 11) + " (should be true)");*/
        System.out.println(makeBricks(20,0,19));
    }

    public static boolean makeBricks(int small, int big, int goal) {
        if (goal < 0 || big < 0 || small < 0) {
            return false;
        }

        for (int i = 0; i <= big; i++) {
            int bigTotal = (i + 1) * 5;
            if (bigTotal <= goal && bigTotal + small >= goal) {
                return true;
            }
        }
        /*
        int bigTotal = goal / 5 * 5;
        int actualBigSize = big * 5;

        if (bigTotal >= actualBigSize && actualBigSize <= goal) {
            return actualBigSize + small >= goal;
        } else if (actualBigSize - 5 <= goal) {
            return actualBigSize - 5 + small >= goal;

        }
*/
        return false;
    }
}
