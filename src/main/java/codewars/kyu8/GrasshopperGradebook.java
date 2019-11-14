package codewars.kyu8;

public class GrasshopperGradebook {

    public static char getGrade(int s1, int s2, int s3) {
        int mean = (s1 + s2 + s3) / 3;
        char grade = 'F';
        if (90 <= mean && mean <= 100) {
            grade = 'A';
        } else if (80 <= mean && mean < 90) {
            grade = 'B';
        } else if (70 <= mean && mean < 80) {
            grade = 'C';
        } else if (60 <= mean && mean < 70) {
            grade = 'D';
        }
        return grade;
    }
}
