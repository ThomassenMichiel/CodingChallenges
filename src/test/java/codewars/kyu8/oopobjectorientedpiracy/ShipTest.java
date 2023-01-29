package codewars.kyu8.oopobjectorientedpiracy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void emptyShipShouldNotWorthToAboard() {
        Ship ship = new Ship(0, 0);
        assertEquals(false, ship.isWorthIt(), "<draft: 0, crew: 0>");
    }

    @Test
    void shipWithLotOfBootyWorthToAboard() {
        Ship ship = new Ship(40, 5);
        assertEquals(true, ship.isWorthIt(), "<draft: 40, crew: 5>");
    }

    @Test
    void oneHundredRandomSheeps() {
        Ship ship = new Ship(96.66453586815585, 65);
        assertEquals(false, ship.isWorthIt(), "<draft: 96.66453586815585, crew: 65>");
    }

    @Test
    void regularBoat() {
        Ship ship = new Ship(15, 20);
        assertEquals(false, ship.isWorthIt(), "<draft: 15, crew: 20>");
    }

    @Test
    void boatOnTheEdge() {
        Ship ship = new Ship(35,10);
        assertEquals(false, ship.isWorthIt(), "<draft: 35, crew: 10>");
    }
}
