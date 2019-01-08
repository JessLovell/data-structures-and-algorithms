package graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void testAddNode() {

        Graph one = new Graph();
        assertEquals("expect size to be 0", 0, one.size());
        Node oneNode = one.addNode(13);
        assertEquals("expect size to be 1", 1, one.size());
        assertEquals("expect node to be same node", 13, oneNode.data);
        one.addNode(13);
        one.addNode("13");
        one.addNode("14");
        one.addNode(13);
        one.addNode(13);
        assertEquals("expect size to be 6", 6, one.size());

        Graph two = new Graph();
        two.addNode(9);
        two.addNode(14);
        assertEquals("expect two to have size 2", 2, two.size());
    }

    @Test
    public void testAddEdge() {

        Graph one = new Graph();
        Node oneNode = one.addNode(13);
        Node twoNode = one.addNode("something");
        Node threeNode = one.addNode('c');

        assertEquals("expect oneNode to have empty neighbors", 0, oneNode.neighbors.size());
        assertEquals("expect twoNode to have empty neighbors", 0, twoNode.neighbors.size());


        one.addEdge(oneNode, twoNode);
        assertEquals("expect 13 to have neighbor size 1", 1, oneNode.neighbors.size());
        assertEquals("expect something to have neighbor size 1", 1, twoNode.neighbors.size());
        assertEquals("expect 'c' to have neighbor size 0", 0, threeNode.neighbors.size());
        assertEquals("expect 13 to have contain twoNode", "[something with weight 0]", oneNode.neighbors.toString());
        assertEquals("expect 13 to have contain twoNode", "[13 with weight 0]", twoNode.neighbors.toString());
        assertEquals("expect 'c' to have neighbor size 0", "[]", threeNode.neighbors.toString());
    }

    @Test
    public void testAddWeightedEdge() {

        Graph one = new Graph();
        Node oneNode = one.addNode(13);
        Node twoNode = one.addNode("something");
        Node threeNode = one.addNode('c');

        assertEquals("expect oneNode to have empty neighbors", 0, oneNode.neighbors.size());
        assertEquals("expect twoNode to have empty neighbors", 0, twoNode.neighbors.size());

        one.addEdge(oneNode, twoNode, 16);
        assertEquals("expect 13 to have neighbor size 1", 1, oneNode.neighbors.size());
        assertEquals("expect something to have neighbor size 1", 1, twoNode.neighbors.size());
        assertEquals("expect 'c' to have neighbor size 0", 0, threeNode.neighbors.size());
        assertEquals("expect 13 to have contain twoNode", "[something with weight 16]", oneNode.neighbors.toString());
        assertEquals("expect 13 to have contain twoNode", "[13 with weight 16]", twoNode.neighbors.toString());
        assertEquals("expect 'c' to have neighbor size 0", "[]", threeNode.neighbors.toString());

        one.addEdge(oneNode, threeNode, 1);
        assertEquals("expect 13 to have neighbor size 2", 2, oneNode.neighbors.size());
        assertEquals("expect 'c' to have neighbor size 1", 1, threeNode.neighbors.size());
        assertEquals("expect 13 to have contain twoNode", true, oneNode.neighbors.toString().contains("c with weight 1"));
        assertEquals("expect 13 to have contain twoNode", true, oneNode.neighbors.toString().contains("something with weight 16"));
        assertEquals("expect 'c' to have contain 13", "[13 with weight 1]", threeNode.neighbors.toString());
    }

    @Test
    public void testGetNodes() {

        Graph graph = new Graph();
        Node one = graph.addNode(13);
        Node two = graph.addNode(2);
        graph.addEdge(two, graph.addNode(17));
        graph.addEdge(one, graph.addNode(102), 19);
        graph.addEdge(two, one, 2);
        assertEquals("expect graph to contain 'one' Node", true, graph.getNodes().contains(one));
        assertEquals("expect graph to contain 'two' Node", true, graph.getNodes().contains(two));

        Graph oneGraph = new Graph();
        Node oneNode = oneGraph.addNode(13);
        Node twoNode = oneGraph.addNode("something");
        Node threeNode = oneGraph.addNode('c');
        assertEquals("expect graph to contain things", true , oneGraph.getNodes().contains(oneNode));
        assertEquals("expect graph to contain things", true , oneGraph.getNodes().contains(twoNode));
        assertEquals("expect graph to contain things", true , oneGraph.getNodes().contains(threeNode));
    }

//    @Test
//    public void testGetNeighbors() {
//
//        Graph graph = new Graph();
//        Node one = graph.addNode(13);
//        Node two = graph.addNode(2);
//        graph.addEdge(two, one, 2);
//
//
//        assertEquals("expect one to have 2 neighbors",1, graph.getNeighbors(one).size());
//        assertEquals("expect one to contain 'two'", two, graph.getNeighbors(one).iterator().next());
//        assertEquals("expect two to have 1 neighbors",true, graph.getNeighbors(two));
//        assertEquals("expect two to have 1 neighbors",true, graph.getNeighbors(two).size());
//        assertEquals("expect 's' to have 1 neighbors","[]", graph.getNeighbors(graph.addNode('s')));
//    }

    @Test
    public void testSize() {

        Graph graph = new Graph();
        assertEquals("expect to have size 0", 0, graph.size());
        graph.addNode(2);
        assertEquals("expect to have size 1", 1, graph.size());
        graph.addNode(2);
        graph.addNode(2);
        graph.addNode(2);
        graph.addNode(2);
        graph.addNode(2);
        graph.addNode(2);
        graph.addNode(2);
        graph.addNode(2);
        graph.addNode(2);
        graph.addNode(2);
        graph.addNode(2);
        graph.addNode(2);
        graph.addNode(2);
        graph.addNode(2);
        graph.addNode(2);
        graph.addNode(2);
        graph.addNode(2);
        graph.addNode(2);
        graph.addNode(2);
        graph.addNode(2);
        graph.addNode(2);
        graph.addNode(2);
        graph.addNode(2);
        graph.addNode(2);
        assertEquals("expect to have size 25", 25, graph.size());
    }

    @Test
    public void testBreadthFirst(){

        Graph graph = new Graph();
        Node one = graph.addNode(13);
        Node two = graph.addNode(2);
        graph.addEdge(two, graph.addNode(17));
        graph.addEdge(one, graph.addNode(102), 19);
        graph.addEdge(two, one, 2);

        Graph.breadthFirst(one, graph);
    }
}