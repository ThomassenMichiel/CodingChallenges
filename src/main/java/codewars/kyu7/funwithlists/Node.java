package codewars.kyu7.funwithlists;

import java.util.Objects;

public class Node<T> {
    public Object data;
    public Node next;
    
    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }
    
    public Node(T data) {
        this(data, null);
    }
    
    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(data, node.data) && Objects.equals(next, node.next);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(data, next);
    }
}
