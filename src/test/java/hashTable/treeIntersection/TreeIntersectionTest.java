package hashTable.treeIntersection;

import apple.laf.JRSUIUtils;
import org.junit.Test;
import tree.BinaryTree;
import tree.Node;

import static org.junit.Assert.*;

public class TreeIntersectionTest {

    @Test
    public void testTreeIntersection(){

        Node rootOne = new Node(3,
                new Node(4,
                        new Node (105,
                                new Node(36, null, null),
                                new Node (75, null, null)),
                        new Node (88,
                                new Node(1, null, null),
                                new Node (7, null, null))),
                new Node(10,
                        new Node(13, null, null),
                        new Node(33,
                                new Node (8, null, null),
                                new Node(12, null, null))));

        BinaryTree treeOne = new BinaryTree();
        treeOne.root = rootOne;

        Node rootTwo = new Node (3,
                new Node(1,
                        new Node (2,
                                new Node(3, null, null),
                                new Node (4, null, null)),
                        new Node (5,
                                new Node(6, null, null),
                                new Node (7, null, null))),
                new Node(8,
                        new Node(9, null, null),
                        new Node(10,
                                new Node (11, null, null),
                                new Node(12, null, null))));
        BinaryTree treeTwo = new BinaryTree();
        treeTwo.root = rootTwo;


        assertEquals("expect 1, 2, 3 to be in the set", TreeIntersection.intersection(treeOne, treeTwo));
    }

}