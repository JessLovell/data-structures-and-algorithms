package hashTable.treeIntersection;



import graph.Node;
import tree.BinaryTree;

import java.util.HashSet;

public class TreeIntersection {
    public static HashSet intersection(BinaryTree one, BinaryTree two){

        HashSet intersect = new HashSet();
        HashSet oneSet = one.toSet();
        HashSet twoSet = two.toSet();

        for (Node n : (HashSet<Node>) oneSet){
            if (twoSet.contains(n)){
                intersect.add(n);
            }
        }
        return intersect;
    }
}
