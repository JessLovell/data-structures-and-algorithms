package graph;

import java.util.HashSet;

public class Graph<T>{

    public HashSet<Node<T>> nodes;

    //Constructor Function for Graph
    public Graph(){
        this.nodes = new HashSet<>();
    }

    //This adds a node to the graph
    public Node<T> addNode(T data){

        Node node = new Node(data);
        this.nodes.add(node);
        return node;
    }

    //This method adds an edge between two node and returns true
    public boolean addEdge(Node<T> one, Node<T> two){

        if (this.nodes.contains(one) && this.nodes.contains(two)){
            one.addNeighbor(two);
            two.addNeighbor(one);
            return true;
        }
        return false;
    }

    //This method adds an edge and a weight between two nodes and returns true
    public boolean addEdge(Node<T> one, Node<T> two, int weight){

        if (this.nodes.contains(one) && this.nodes.contains(two)){
            one.addNeighbor(two, weight);
            two.addNeighbor(one, weight);
            return true;
        }
        return false;
    }

    //This method returns all the nodes in the graph as a set
    public String getNodes() {

        return this.nodes.toString();
    }

    //This method returns all the neighbors of a node and their weights
    public String getNeighbors(Node<T> node){

        //Returns a collection of nodes connected to the given node
        if (this.nodes.contains(node) && node.neighbors != null){
            return node.neighbors.toString();
        } else if (this.nodes.contains(node) && node.neighbors == null) {
            return node + " has no neighbors.";
        } else{
            return null;
        }
    }

    //This method returns the number of nodes in the graph
    public int size() {

        return this.nodes.size();
    }
}
