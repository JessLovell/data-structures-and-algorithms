package graph.getEdge;

import graph.Edge;
import graph.Graph;
import graph.Node;

import java.util.HashSet;

public class GetEdge {

    public static String flightItinerary(String[] cities, Graph map){

        int cost = 0;
        String result = "False";
        Node node = null;
        boolean direct = false;

        //find the start node in the graph
        for (Node n : (HashSet<Node>)map.getNodes()){
            if (n.data == cities[0]){
                node = n;
            }
        }

        //if the start node is not in the set, return false
        if (node == null){
            return result;
        }

        //check the neighbors of the start nde
        for (int i = 1; i < cities.length; i++){
            for (Edge e : (HashSet<Edge>) map.getNeighbors(node)){
                if (cities[i] == e.node.data){
                    cost += e.weight;
                    node = e.node;
                    result = "True, $" + cost;
                    direct = true;
                }
            }

            //got help here from Evan
            if (direct){
                direct = false;
            } else {
                return "False";
            }
        }

        return result;
    }
}
