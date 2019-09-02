package codewars.kyu8;

class Barycenter {
    public static double[] barTriang(double[] x, double[] y, double[] z) {
        double x0 = Math.round((x[0] + y[0] + z[0]) / 3 * 100) / 100d;
        double y0 = Math.round((x[1] + y[1] + z[1]) / 3 * 100) / 100d;
        return new double[]{x0, y0};
    }
}