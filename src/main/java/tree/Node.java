package tree;

public class Node<T> {
    public T data;
    public Node<T> leftChild;
    public Node<T> rightChild;

    public Node(T data, Node<T> leftChild, Node<T> rightChild) {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
}
