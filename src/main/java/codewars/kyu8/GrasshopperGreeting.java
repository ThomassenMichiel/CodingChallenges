package codewars.kyu8;

class GrasshopperGreeting {
    static String greet(String name, String owner) {
        return name.equals(owner) ? "Hello boss" : "Hello guest";
    }
}
