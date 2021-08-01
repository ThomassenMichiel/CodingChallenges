package codewars.kyu7.circularlist;

/**
 * url: https://www.codewars.com/kata/5b2e60742ae7543f9d00005d/
 */
public class CircularList<T> {
    private int position = -1;
    private T[] elements;

    public CircularList(final T... elements) {
        this.elements = elements;
        if (elements.length == 0) {
            throw new RuntimeException();
        }
    }

    T next() {
        position++;
        if (position == elements.length) {
            position = 0;
        }
        return elements[position];
    }

    T prev() {
        position--;
        if (position < 0) {
            position = elements.length - 1;
        }
        return elements[position];
    }
}

