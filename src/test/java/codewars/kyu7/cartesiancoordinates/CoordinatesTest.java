package codewars.kyu7.cartesiancoordinates;

import java.awt.geom.Point2D;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoordinatesTest {
    
    @Test
    public void test_1() {
        Point2D result = new CoordinatesInspector().coordinates(90.0, 1.0);
        assertEquals("Incorrect coordinates", new Point2D.Double(0.0, 1.0), result);
    }
    
    @Test
    public void test_2() {
        Point2D result = new CoordinatesInspector().coordinates(45.0, 1.0);
        assertEquals("Incorrect coordinates", new Point2D.Double(0.7071067812, 0.7071067812), result);
    }
    
}
