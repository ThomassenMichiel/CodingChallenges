package codewars.kyu8;

public class CalculateBMI {
    public static String bmi(double weight, double height) {
        double bmi = weight / Math.pow(height, 2);
        String bmiResult = "Obese";
        if (bmi <= 18.5) {
            bmiResult = "Underweight";
        } else if (bmi <= 25) {
            bmiResult = "Normal";
        } else if (bmi <= 30) {
            bmiResult = "Overweight";
        }
        return bmiResult;
    }
}
