package codewars.kyu8;

public class AreaOrPerimeter {
    public static int areaOrPerimeter (int l, int w) {
        return l == w ? w * 4 : l * 2 + w * 2;
    }
}
