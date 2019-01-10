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

    @Test
    public void testGetNeighbors() {

        Graph graph = new Graph();
        Node one = graph.addNode(13);
        Node two = graph.addNode(2);

        assertEquals("Expect no neighbors for one", 0, graph.getNeighbors(one).size());
        assertEquals("Expect no neighbors for two", 0, graph.getNeighbors(two).size());

        graph.addEdge(one, two);
        assertEquals("Expect no neighbors for one", 1, graph.getNeighbors(one).size());
        assertEquals("Expect no neighbors for two", 1, graph.getNeighbors(two).size());
    }

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
        Node one = graph.addNode(1);
        Node two = graph.addNode(2);
        Node three = graph.addNode(3);
        Node four = graph.addNode(4);
        Node five = graph.addNode(5);

        graph.addEdge(two, three);
        graph.addEdge(one, four, 5);
        graph.addEdge(two, one, 2);

        assertTrue("Start from 1: [1, 4, 2, 3] or [1, 2, 4, 3]", Graph.breadthFirst(one).toString().contains("[1, 4, 2, 3]") || Graph.breadthFirst(one).toString().contains("[1, 2, 4, 3]"));

        graph.addEdge(five, three);
        graph.addEdge(five, four);
        Node six = graph.addNode(6);
        graph.addEdge(four, six);

//        1 - 4 -- 6
//        |     \
//        2 - 3 - 5

        assertTrue("Start from 1: [1, 4, 2, 6, 5, 3] or [1, 2, 4, 6, 5, 3]", Graph.breadthFirst(one).toString().contains("6, 5, 3") || Graph.breadthFirst(one).toString().contains("6"));
        assertEquals("Start from 3", "[3, 2, 5, 1, 4, 6]", Graph.breadthFirst(three).toString());
    }

    @Test
    public void testDepthFirst(){
        Graph graph = new Graph();
        Node one = graph.addNode(1);
        Node two = graph.addNode(2);
        Node three = graph.addNode(3);
        Node four = graph.addNode(4);
        Node five = graph.addNode(5);
        Node six = graph.addNode(6);

        graph.addEdge(two, three);
        graph.addEdge(one, four, 5);
        graph.addEdge(two, one, 2);
        graph.addEdge(five, three);
        graph.addEdge(five, four);
        graph.addEdge(four, six);


        Graph abc = new Graph();
        Node a = abc.addNode("a");
        Node b = abc.addNode("b");
        Node c = abc.addNode("c");
        Node d = abc.addNode("d");
        Node e = abc.addNode("e");
        Node f = abc.addNode("f");
        Node g = abc.addNode("g");
        Node h = abc.addNode("h");

        abc.addEdge(a, b);
        abc.addEdge(a, d);
        abc.addEdge(b, c);
        abc.addEdge(c, g);
        abc.addEdge(e, d);
        abc.addEdge(h, f);
        abc.addEdge(h, d);
        abc.addEdge(f, d);

        assertEquals("Expect to start with 'one'",  one, Graph.depthFirst(one).getFirst());
        assertEquals("Expect to have size 6", 6, Graph.depthFirst(one).size());
        assertEquals("Expect to start with 'g'",  g, Graph.depthFirst(g).getFirst());
        assertEquals("Expect to have size 8", 8, Graph.depthFirst(g).size());
        assertEquals("Expect 'c'",  c, Graph.depthFirst(g).remove(1));
        assertEquals("Expect 'b'",  b, Graph.depthFirst(g).remove(2));


    }
}