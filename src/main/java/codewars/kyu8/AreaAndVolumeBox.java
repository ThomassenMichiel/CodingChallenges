package codewars.kyu8;

public class AreaAndVolumeBox {
    public static int[] getSize(int w,int h,int d) {
        return new int[]{
                (2*(h*w))+(2*(h*d))+(2*(w*d)),
                w*h*d
        };
    }
}
