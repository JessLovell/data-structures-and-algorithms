package graph.getEdge;

import graph.Graph;
import graph.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetEdgeTest {

    @Test
    public void testBreadthFirst(){
        Graph map = new Graph();
        Node pandora = map.addNode("Pandora");
        Node arendelle = map.addNode("Arendelle");
        Node metroville = map.addNode("Metroville");
        Node monstropolis = map.addNode("Monstropolis");
        Node naboo = map.addNode("Naboo");
        Node narnia = map.addNode("Narnia");

        map.addEdge(pandora, metroville, 82);
        map.addEdge(pandora, arendelle, 150);
        map.addEdge(metroville, arendelle, 99);
        map.addEdge(arendelle, monstropolis, 42);
        map.addEdge(monstropolis, metroville, 105);
        map.addEdge(monstropolis, naboo, 73);
        map.addEdge(naboo, metroville, 26);
    }

}