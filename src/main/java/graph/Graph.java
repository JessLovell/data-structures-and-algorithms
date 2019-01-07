package graph;

import java.util.HashSet;

public class Graph<T>{

    public HashSet<Node<T>> nodes;

    public Graph(){
        this.nodes = new HashSet<>();
    }

    public Node<T> addNode(T data){
        // Adds a new node to the graph
        
        // Takes in the value of that node
        // Returns the added node
    }

    public void addEdge(){
        //Adds a new edge between two nodes in the graph -
        //  Include the ability to have a “weight” -
        // Takes in the two nodes to be connected by the edge -
        // Both nodes should already be in the Graph
    }

    public void getNodes() {
        //Returns all of the nodes in the graph as a collection (set, list, or similar)
    }

    public void getNeighbors(){
        //Returns a collection of nodes connected to the given node
        //    Takes in a given node
        //    Include the weight of the connection in the returned collection
    }

    public void size(){
        //Returns the total number of nodes in the graph
    }
}
