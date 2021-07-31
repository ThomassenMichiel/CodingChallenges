package codewars.kyu7.speedcontrol;

/**
 * url: https://www.codewars.com/kata/56484848ba95170a8000004d/
 */
public class GpsSpeed {
    public static int gps(int s, double[] x) {
        double topSpeed = 0;
        for (int i = 1; i < x.length; i++) {
            topSpeed = Math.max(3600 * (x[i] - x[i - 1]) / s, topSpeed);
        }
        return (int) topSpeed;
    }
}