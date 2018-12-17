package Tree;

public class Node<T> {
    public T data;
    public Node leftChild;
    public Node rightChild;

    public Node(T data, Node leftChild, Node rightChild) {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public String toString(){
        return (String)this.data;
    }
}
