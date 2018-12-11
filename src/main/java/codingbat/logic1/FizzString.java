package codingbat.logic1;

public class FizzString {
    public static void main(String[] args) {
        System.out.println(fizzString("fig"));
        System.out.println(fizzString("dib"));
        System.out.println(fizzString("fib"));
    }

    public static String fizzString(String str) {
        String returnString = "";
        if (str.charAt(0) == 'f') {
            returnString += "Fizz";
        }

        if (str.charAt(str.length()-1) == 'b') {
            returnString += "Buzz";
        }
        return returnString.isEmpty() ? str : returnString;
    }
}
