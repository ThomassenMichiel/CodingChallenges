package codewars.kyu7.cartesiancoordinates;

import java.awt.geom.Point2D;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * url: https://www.codewars.com/kata/555f43d8140a6df1dd00012b/train/java
 */
public class CoordinatesInspector {

  public Point2D coordinates(Double degrees, Double radius) {
      degrees = (degrees / 180) * Math.PI;
      double x = new BigDecimal(String.valueOf(radius * Math.cos(degrees))).setScale(10, RoundingMode.HALF_UP).doubleValue();
      double y = new BigDecimal(String.valueOf(radius * Math.sin(degrees))).setScale(10, RoundingMode.HALF_UP).doubleValue();
      return new Point2D.Double(x, y);
  }

}
