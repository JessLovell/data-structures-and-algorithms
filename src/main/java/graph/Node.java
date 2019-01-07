package graph;

import java.util.HashSet;

public class Node<T> {
    public T data;
    public HashSet<Edge> neighbors;

    public Node(T data){
        this.data = data;
        this.neighbors = new HashSet<>();
    }

    public boolean addNeighbor(Node<T> node){
        Edge edge = new Edge(node);
        this.neighbors.add(edge);
        return true;
    }

    public boolean addNeighbor(Node<T> node, int weight){
        Edge edge = new Edge(node, weight);
        this.neighbors.add(edge);
        return true;
    }

    public String toString(){

        if (this.neighbors.size() != 0){
            return "Node: " + this.data + " has edge(s): \n" + this.neighbors.toString();
        }
        return this.data.toString();
    }
}
