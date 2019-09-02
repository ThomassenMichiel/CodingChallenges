package codewars.kyu8;

public class Polygon {
    int sides;
    int sideLength;
    
    public static void main(String[] args) {
        Polygon polygon = new Polygon(8,9);
        System.out.println(polygon.circleDiameter());
    }

    public Polygon(int sides, int sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }
    
    public double circleDiameter(){
        return sideLength / Math.tan(Math.PI/sides);
    }
    
}