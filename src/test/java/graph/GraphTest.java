package graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void testAddNode() {
    }

    @Test
    public void testAddEdge() {
    }

    @Test
    public void testAddWeightedEdge() {
    }

    @Test
    public void testGetNodes() {
        Graph graph = new Graph();
        Node one = graph.addNode(13);
        Node two = graph.addNode(2);
        graph.addEdge(two, graph.addNode(17));
        graph.addEdge(one, graph.addNode(102), 19);
        graph.addEdge(two, one, 2);



        System.out.println(graph.getNodes());
    }

    @Test
    public void testGetNeighbors() {
    }

    @Test
    public void testSize() {
    }
}