package codingbat.string2;

public class StarOut {
    public String starOut(String str) {
        return str.replaceAll(".{0,1}\\*{1,}.{0,1}","");
    }
}
