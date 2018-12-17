package Tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test public void testBinaryTree() {

        BinaryTree tree = new BinaryTree();
        assertEquals("expect to have null root", null, tree.root);

        tree.root = new Node(12, null, null);
        assertTrue("expect to have non-null root", null != tree.root);
        assertTrue("expect to have 12 as root", 12 == (int) tree.root.data);
    }

    @Test public void testOrder() {
        BinaryTree tree = new BinaryTree();
        assertTrue("Expect null to be returned", null == tree.order("this"));

        tree.root = new Node(12, null, null);
        assertTrue("Expect list to be returned for pre", null != tree.order("pre"));
        assertTrue("Expect list to be returned for PRE", null != tree.order("PRE"));
        assertTrue("Expect list to be returned for in", null != tree.order("in"));
        assertTrue("Expect list to be returned for iN", null != tree.order("iN"));
        assertTrue("Expect list to be returned for post", null != tree.order("post"));
        assertTrue("Expect list to be returned for Post", null != tree.order("Post"));
    }

    @Test public void testPreOrder() {

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

        Node rootTwo = new Node(3,
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

        Node rootThree = new Node(3,
                new Node(12,
                        new Node (7,
                                new Node(6, null, null),
                                new Node (5, null, null)),
                        new Node (8,
                                new Node(4, null, null),
                                new Node (3, null, null))),
                new Node(11,
                        new Node(9, null, null),
                        new Node(10,
                                new Node (2, null, null),
                                new Node(1, null, null))));
        BinaryTree treeThree = new BinaryTree();
        treeThree.root = rootThree;

        assertEquals("Expect lists to equal","[3, 4, 105, 36, 75, 88, 1, 7, 10, 13, 33, 8, 12]", treeOne.order("pre").toString());
        assertEquals("Expect lists to equal","[3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]", treeTwo.order("pre").toString());
        assertEquals("Expect lists to equal","[3, 12, 7, 6, 5, 8, 4, 3, 11, 9, 10, 2, 1]", treeThree.order("pre").toString());
    }

    @Test public void testInOrder(){
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

        Node rootTwo = new Node(3,
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

        Node rootThree = new Node(3,
                new Node(12,
                        new Node (7,
                                new Node(6, null, null),
                                new Node (5, null, null)),
                        new Node (8,
                                new Node(4, null, null),
                                new Node (3, null, null))),
                new Node(11,
                        new Node(9, null, null),
                        new Node(10,
                                new Node (2, null, null),
                                new Node(1, null, null))));
        BinaryTree treeThree = new BinaryTree();
        treeThree.root = rootThree;

        assertEquals("Expect lists to equal","[36, 105, 75, 4, 1, 88, 7, 3, 13, 10, 8, 33, 12]", treeOne.order("in").toString());
        assertEquals("Expect lists to equal","[3, 2, 4, 1, 6, 5, 7, 3, 9, 8, 11, 10, 12]", treeTwo.order("in").toString());
        assertEquals("Expect lists to equal","[6, 7, 5, 12, 4, 8, 3, 3, 9, 11, 2, 10, 1]", treeThree.order("in").toString());
    }

    @Test public void testPostOrder() {
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

        Node rootThree = new Node(3,
                new Node(12,
                        new Node (7,
                                new Node(6, null, null),
                                new Node (5, null, null)),
                        new Node (8,
                                new Node(4, null, null),
                                new Node (3, null, null))),
                new Node(11,
                        new Node(9, null, null),
                        new Node(10,
                                new Node (2, null, null),
                                new Node(1, null, null))));
        BinaryTree treeThree = new BinaryTree();
        treeThree.root = rootThree;

        assertEquals("Expect lists to equal","[36, 75, 105, 1, 7, 88, 4, 13, 8, 12, 33, 10, 3]", treeOne.order("post").toString());
        assertEquals("Expect lists to equal","[3, 4, 2, 6, 7, 5, 1, 9, 11, 12, 10, 8, 3]", treeTwo.order("post").toString());
        assertEquals("Expect lists to equal","[6, 5, 7, 4, 3, 8, 12, 9, 2, 1, 10, 11, 3]", treeThree.order("post").toString());
    }
}