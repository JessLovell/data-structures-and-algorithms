package graph;

import java.util.HashSet;

public class FlightFinder {

    public Graph map;
    public String[] cities;

    public FlightFinder(Graph map, String[] cities){
        this.map = map;
        this.cities = cities;
    }

    public boolean flightItinerary(){

        int cost = 0;
        boolean start = true;

        while(start)
        for(int i = 0; i < this.cities.length; i++){
            for(Node n : (HashSet<Node>) map.getNodes()){
                if(this.cities[i] == n.data & i != this.cities.length - 1){
                } else{
                    
                }
            }
        }

        return false;
    }
}
