package graph.getEdge;

import graph.Graph;
import graph.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetEdgeTest {

    @Test
    public void testFlightFinder(){
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
        map.addEdge(naboo, narnia, 250);
        map.addEdge(narnia, metroville, 37);

        assertEquals("Expect Pandora to Metroville to be true","True, $82", GetEdge.flightItinerary(new String[]{"Metroville", "Pandora"}, map));
        assertEquals("Expect to be 3: True","True, $115", GetEdge.flightItinerary(new String[]{"Arendelle", "Monstropolis", "Naboo"}, map));
        assertEquals("Expect to be false: Narnia to Naboo","False", GetEdge.flightItinerary(new String[]{"Naboo", "Pandora"}, map));
        assertEquals("Expect to be false: Narnia to Arendelle, Naboo","False", GetEdge.flightItinerary(new String[]{"Narnia", "Arendelle", "Naboo"}, map));
        assertEquals("Expect to be True","True, $275", GetEdge.flightItinerary(new String[]{"Naboo", "Metroville", "Arendelle", "Pandora"}, map));
    }

}