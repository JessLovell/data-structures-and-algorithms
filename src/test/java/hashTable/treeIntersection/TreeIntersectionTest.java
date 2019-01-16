package hashTable.treeIntersection;

import apple.laf.JRSUIUtils;
import org.junit.Test;
import tree.BinaryTree;
import tree.Node;

import java.util.HashSet;

import static org.junit.Assert.*;

public class TreeIntersectionTest {

    @Test
    public void testTreeIntersectionOne(){

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


        HashSet testOne  = TreeIntersection.intersection(treeOne, treeTwo);
        assertEquals("Expect size to be 7",7, testOne.size());
        assertTrue("expect 1 to be in the intersection", testOne.contains(1));
        assertTrue("expect 3 to be in the intersection", testOne.contains(3));
        assertTrue("expect 4 to be in the intersection", testOne.contains(4));
        assertTrue("expect 7 to be in the intersection", testOne.contains(7));
        assertTrue("expect 8 to be in the intersection", testOne.contains(8));
        assertTrue("expect 10 to be in the intersection", testOne.contains(10));
        assertTrue("expect 12 to be in the intersection", testOne.contains(12));
        assertFalse("expect 2 not to be in intersection", testOne.contains(2));
        assertFalse("expect 5 not to be in intersection", testOne.contains(5));
        assertFalse("expect 6 not to be in intersection", testOne.contains(6));
        assertFalse("expect 9 not to be in intersection", testOne.contains(9));
        assertFalse("expect 11 not to be in intersection", testOne.contains(11));
        assertFalse("expect 105 not to be in intersection", testOne.contains(105));
        assertFalse("expect 36 not to be in intersection", testOne.contains(36));
        assertFalse("expect 75 not to be in intersection", testOne.contains(75));
        assertFalse("expect 88 not to be in intersection", testOne.contains(88));
        assertFalse("expect 13 not to be in intersection", testOne.contains(13));
        assertFalse("expect 33 not to be in intersection", testOne.contains(33));
    }

    @Test
    public void testTreeIntersectionTwo(){

        Node rootOne =
                new Node(3, new Node(5, null, null), new Node(6, null, null));
        BinaryTree treeOne = new BinaryTree();
        treeOne.root = rootOne;

        Node rootTwo = new Node (3, new Node(4, null, null), new Node (5, null, null));
        BinaryTree treeTwo = new BinaryTree();
        treeTwo.root = rootTwo;

        HashSet testOne  = TreeIntersection.intersection(treeOne, treeTwo);
        assertEquals("Expect size to be 2", 2, testOne.size());
        assertTrue("expect 3 to be in the intersection", testOne.contains(3));
        assertTrue("expect 5 to be in the intersection", testOne.contains(5));
        assertFalse("expect 6 not to be in intersection", testOne.contains(6));
        assertFalse("expect 4 not to be in intersection", testOne.contains(4));
    }

    @Test
    public void testToSet(){

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


        assertTrue("Expect Hashset to be returned", TreeIntersection.toSet(treeOne) instanceof HashSet);
        assertEquals("Expect to size to be 13", 13, TreeIntersection.toSet(treeOne).size());
        assertTrue("Expect set to have 3", TreeIntersection.toSet(treeOne).contains(3));
        assertTrue("Expect set to have 4", TreeIntersection.toSet(treeOne).contains(4));
        assertTrue("Expect set to have 105", TreeIntersection.toSet(treeOne).contains(105));
        assertTrue("Expect set to have 36", TreeIntersection.toSet(treeOne).contains(36));
        assertTrue("Expect set to have 75", TreeIntersection.toSet(treeOne).contains(75));
        assertTrue("Expect set to have 88", TreeIntersection.toSet(treeOne).contains(88));
        assertTrue("Expect set to have 1", TreeIntersection.toSet(treeOne).contains(1));
        assertTrue("Expect set to have 7", TreeIntersection.toSet(treeOne).contains(7));
        assertTrue("Expect set to have 10", TreeIntersection.toSet(treeOne).contains(10));
        assertTrue("Expect set to have 13", TreeIntersection.toSet(treeOne).contains(13));
        assertTrue("Expect set to have 33", TreeIntersection.toSet(treeOne).contains(33));
        assertTrue("Expect set to have 8", TreeIntersection.toSet(treeOne).contains(8));
        assertTrue("Expect set to have 12", TreeIntersection.toSet(treeOne).contains(12));


        Node rootTwo = new Node (3, new Node(4, null, null), new Node (5, null, null));
        BinaryTree treeTwo = new BinaryTree();
        treeTwo.root = rootTwo;

        assertTrue("Expect Hashset to be returned", TreeIntersection.toSet(treeTwo) instanceof HashSet);
        assertEquals("Expect to size to be 3", 3, TreeIntersection.toSet(treeTwo).size());
        assertTrue("Expect set to have 3", TreeIntersection.toSet(treeTwo).contains(3));
        assertTrue("Expect set to have 4", TreeIntersection.toSet(treeTwo).contains(4));
        assertTrue("Expect set to have 5", TreeIntersection.toSet(treeTwo).contains(5));
    }

}