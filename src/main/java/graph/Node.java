package graph;

import java.util.HashSet;

public class Node<T> {
    public T data;
    public HashSet<Edge> neighbors;

    public Node(T data){
        this.data = data;
    }

    public boolean addNeighbor(Node<T> node, T weight){
        Edge edge = new Edge(weight, node);
        neighbors.add(edge);
        return true;
    }
}
