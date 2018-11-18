package codingbat.warmup2;

public class Has271 {
    public static void main(String[] args) {
        /*System.out.println(has271(new int[]{1,2,7,1}));
        System.out.println(has271(new int[]{1,2,8,1}));
        System.out.println(has271(new int[]{2,7,1}));*/
        System.out.println(has271(new int[]{2, 7, 4}));
        System.out.println(has271(new int[]{2, 7, -1}));
        System.out.println(has271(new int[]{4,5,3,8,0}));
    }

    public static boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int firstValue = nums[i];
            int valuePlusFive = nums[i + 1];
            int valueMinusOne = nums[i + 2];
            if (firstValue == valuePlusFive - 5 &&
                    (firstValue >= valueMinusOne + 1 - 2 &&
                            firstValue <= valueMinusOne + 1 + 2))
                return true;
        }
        return false;
    }
}
