package codewars.kyu8;

import java.util.Random;

public class Ghost {
    public String color;
    
    public Ghost() {
        setRandomColor();
    }
    
    private void setRandomColor() {
        int i = new Random().nextInt(4);
        String[] colors = {"red", "white", "yellow", "purple"};
        setColor(colors[i]);
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
}
