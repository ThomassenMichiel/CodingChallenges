package codewars.kyu7.greetme;

/**
 * url: https://www.codewars.com/kata/535474308bb336c9980006f2
 */
public class GreetMe {
    public static String greet(String name) {
        return "Hello " + name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase() + "!";
    }
}
