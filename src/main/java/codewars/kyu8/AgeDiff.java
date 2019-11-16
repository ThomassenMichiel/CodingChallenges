package codewars.kyu8;

public class AgeDiff {
    public static String CalculateAge(int birth, int yearTo) {
        int age = yearTo - birth;
        if (age == 0) {
            return "You were born this very year!";
        } else if (age < 0) {
            age = Math.abs(age);
            return String.format("You will be born in %s year%s.", age, (age == 1 ? "" : "s"));
        }
        return String.format("You are %s year%s old.", age, (age == 1 ? "" : "s"));
    }
}
