package LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class LinkedListTest {

    public void testInsert() {

        LinkedList oneList  = new LinkedList();
        oneList.insert(15);
        oneList.insert(12);
        oneList.insert(3);

        LinkedList twoList = new LinkedList();
        twoList.insert(0);

        assertTrue("Expect true for oneList, 15", oneList.includes(15));
        assertFalse( "Expect false for oneList, 0", oneList.includes(0));

        assertTrue("Expect true for twoList, 0", twoList.includes(0));
        assertFalse("Expect false for twoList, 1 ", twoList.includes(1));
    }

    @Test
    public void testIncludes() {
        LinkedList oneList  = new LinkedList();
        oneList.insert(10);
        oneList.insert(12);
        oneList.insert(3);

        LinkedList twoList = new LinkedList();
        twoList.insert(0);

        LinkedList threeList  = new LinkedList();
        threeList.insert(2);
        threeList.insert(2);
        threeList.insert(2);
        threeList.insert(2);
        threeList.insert(2);

        assertTrue("Expect true for oneList, 10", oneList.includes(10));
        assertFalse( "Expect false for oneList, 0", oneList.includes(0));

        assertTrue("Expect true for twoList, 0", twoList.includes(0));
        assertFalse("Expect false for twoList, 1 ", twoList.includes(1));

        assertTrue("Expect true for threeList, 2", threeList.includes(2));
        assertFalse("Expect false for threeList, 1 ", threeList.includes(1));
    }

    @Test
    public void testPrint() {

        LinkedList oneList  = new LinkedList();
        oneList.insert(15);
        oneList.insert(12);
        oneList.insert(3);

        ArrayList<Integer> one  = new ArrayList<>();
        one.add(3);
        one.add(12);
        one.add(15);

        LinkedList twoList = new LinkedList();
        twoList.insert(0);

        ArrayList<Integer> two = new ArrayList<>();
        two.add(0);

        LinkedList threeList  = new LinkedList();
        threeList.insert(2);
        threeList.insert(2);
        threeList.insert(2);
        threeList.insert(2);
        threeList.insert(2);

        ArrayList<Integer> three = new ArrayList<>();
        three.add(2);
        three.add(2);
        three.add(2);
        three.add(2);
        three.add(2);


        assertEquals(one, oneList.print());
        assertEquals(two, twoList.print());
        assertEquals(three, threeList.print());
    }
}