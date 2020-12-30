package codewars.kyu7.pawndistance;


import java.util.Objects;

public class PawnDistance {
  private String color;
  private long distance;
  public PawnDistance(String s, long d) {
    color = s;
    distance = d;
  }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public long getDistance() {
        return distance;
    }
    
    public void setDistance(long distance) {
        this.distance = distance;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PawnDistance that = (PawnDistance) o;
        return distance == that.distance &&
                Objects.equals(color, that.color);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(color, distance);
    }
    
    @Override
    public String toString() {
        return "PawnDistance{" +
                "color='" + color + '\'' +
                ", distance=" + distance +
                '}';
    }
}
