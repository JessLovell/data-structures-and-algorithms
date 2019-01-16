package hashTable.treeIntersection;

import tree.BinaryTree;
import java.util.HashSet;
import java.util.List;

public class TreeIntersection {
    public static HashSet intersection(BinaryTree one, BinaryTree two){

        HashSet intersect = new HashSet();
        HashSet oneSet = toSet(one);
        HashSet twoSet = toSet(two);

        for (Object n : oneSet){
            if (twoSet.contains(n)){
                intersect.add(n);
            }
        }
        return intersect;
    }


    protected static HashSet toSet(BinaryTree input){

        HashSet setOfNodes = new HashSet();

        List nodes = input.order("pre");

        for (Object n : nodes.toArray()){
            setOfNodes.add(n);
        }
        return setOfNodes;
    }
}
