package codingbat.array1;

import codingbat.ArrayHelper;

import java.util.Arrays;

import static codingbat.ArrayHelper.*;

public class Front11 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(front11(array(1, 2, 3), array(7, 9, 8))));
        System.out.println(Arrays.toString(front11(array(1), array(2))));
        System.out.println(Arrays.toString(front11(array(1, 7), array())));
    }

    private static int[] front11(int[] a, int[] b) {
        if(a.length != 0 && b.length != 0) {
            return new int[]{a[0],b[0]};
        } else if (a.length !=0) {
            return new int[]{a[0]};
        } else if (b.length !=0){
            return new int[]{b[0]};
        } else {
            return new int[]{};
        }
    }

}
