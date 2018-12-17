package Tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void testAdd() {

        BinarySearchTree tree = new BinarySearchTree();
        assertEquals("expect root to be null", null, tree.root);
        assertTrue("expect 12 to be added", tree.add(12));
        assertEquals("expect root to be 12", 12, tree.root.data);
        assertTrue("expect 10 to be added", tree.add(10));
        assertEquals("expect leftchild to be 10", 10, tree.root.leftChild.data);
        assertFalse("expect false", tree.add(10));

        tree.add(9);
        tree.add(7);
        tree.add(1);
        tree.add(17);
        tree.add(16);
        assertEquals("expect to be in order", "[1, 7, 9, 10, 12, 16, 17]", tree.order("in").toString());
    }
}