package codewars.kyu8;

import java.text.DecimalFormat;

public class Converter {
    public static float mpgToKPM(final float mpg) {
        return Float.parseFloat(new DecimalFormat("#.##").format(mpg * 0.354006f));
    }
}
