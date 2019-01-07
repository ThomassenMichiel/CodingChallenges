package codingbat.array1;

import codingbat.ArrayHelper;

import java.util.Arrays;

import static codingbat.ArrayHelper.array;

public class FrontPiece {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(frontPiece(array(1, 2, 3))));
        System.out.println(Arrays.toString(frontPiece(array(1, 2))));
        System.out.println(Arrays.toString(frontPiece(array(1))));
    }

    private static int[] frontPiece(int[] nums) {
        return nums.length < 2 ? nums : new int[]{nums[0],nums[1]};
    }


}
