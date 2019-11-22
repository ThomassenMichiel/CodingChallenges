package codingbat.string2;

public class CatDog {
    public boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;
        for (int i = 0; i < str.toCharArray().length - 2; i++) {
            dogCount += str.substring(i,i+3).equals("dog") ? 1 : 0;
            catCount += str.substring(i,i+3).equals("cat") ? 1 : 0;
        }
        return catCount == dogCount;
    }
}
