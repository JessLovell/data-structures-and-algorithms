package graph;

public class Edge<T> {
    public T weight;
    public Node<T> node;

    public Edge(T weight, Node<T> node){
        this.weight = weight;
        this.node = node;
    }
}
