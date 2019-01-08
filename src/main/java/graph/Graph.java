package graph;

import java.util.HashSet;
import java.util.LinkedList;

public class Graph<T>{

    private HashSet<Node<T>> nodes;

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
    public HashSet<Node<T>> getNodes() {

        return this.nodes;
    }

    //This method returns all the neighbors of a node and their weights
    public HashSet<Edge> getNeighbors(Node<T> node){

        //Returns a collection of nodes connected to the given node
        return node.neighbors;

    }

    //This method returns the number of nodes in the graph
    public int size() {

        return this.nodes.size();
    }

    //This method returns a breadth-first list traversal from the input node
    public static LinkedList<Node> breadthFirst(Node node, Graph graph){

        LinkedList<Node> list = new LinkedList<>();

        //Add the input node's neighbors
        HashSet<Edge> neighbors = graph.getNeighbors(node);
        for (Edge e : neighbors){
            list.add(e.node);
        }

        //Iterate through the list and add nodes if not in the list.
        for (Node n : list){
            HashSet<Edge> temp = n.neighbors;
            for (Edge e : temp){
                if (!temp.contains(e.node)){
                    list.add(e.node);
                }
            }
        }
        return list;
    }
}
