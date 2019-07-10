package tree;

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
        assertEquals("expect leftchild to be 10", 10, tree.root.left.data);
        assertFalse("expect false", tree.add(10));

        tree.add(9);
        tree.add(7);
        tree.add(1);
        tree.add(17);
        tree.add(16);
        assertEquals("expect to be in order", "[1, 7, 9, 10, 12, 16, 17]", tree.order("in").toString());
    }


    @Test
    public void testSearch() {

        BinarySearchTree tree = new BinarySearchTree();
        tree.add(12);
        tree.add(9);
        tree.add(7);
        tree.add(1);
        tree.add(17);
        tree.add(16);

        assertEquals("expect node to be 10", 12, tree.search(12, tree.root).data);
        assertEquals("expect node to be 9", 9, tree.search(9, tree.root).data);
        assertEquals("expect node to be 9", 7, tree.search(7, tree.root).data);
        assertEquals("expect node to be 9", 1, tree.search(1, tree.root).data);
        assertEquals("expect node to be 16", 16, tree.search(16, tree.root).data);
        assertEquals("expect node to be 9", 17, tree.search(17, tree.root).data);

        assertEquals("expect to be in order", "[1, 7, 9, 12, 16, 17]", tree.order("in").toString());
        assertNotEquals("expect nodes to not equal", tree.search(12, tree.root) != tree.search(16, tree.root));
    }
}