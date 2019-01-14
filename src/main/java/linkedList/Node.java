package linkedList;

// This is an inner-class and creates the Nodes for the linkedList class
public class Node<T>{
    public T data;
    public Node next;

    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }
}
