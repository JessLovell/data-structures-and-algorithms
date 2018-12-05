package LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class LinkedListTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
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

//        LinkedList oneList  = new LinkedList();
//        oneList.insert(15);
//        oneList.insert(12);
//        oneList.insert(3);
//
//        ArrayList<Integer> one  = new ArrayList<>();
//        one.add(3);
//        one.add(12);
//        one.add(15);
//
//        LinkedList twoList = new LinkedList();
//        twoList.insert(0);
//
//        ArrayList<Integer> two = new ArrayList<>();
//        two.add(0);
//
//        LinkedList threeList  = new LinkedList();
//        threeList.insert(2);
//        threeList.insert(2);
//        threeList.insert(2);
//        threeList.insert(2);
//        threeList.insert(2);
//
//        ArrayList<Integer> three = new ArrayList<>();
//        three.add(2);
//        three.add(2);
//        three.add(2);
//        three.add(2);
//        three.add(2);
//
//
//        assertEquals(one, oneList.print());
//        assertEquals(two, twoList.print());
//        assertEquals(three, threeList.print());
    }

    @Test public void testAppend() {

        LinkedList oneList  = new LinkedList();
        oneList.insert(10);
        oneList.insert(12);
        oneList.insert(3);
        oneList.append(162);

        assertTrue("Expect true for oneList, 162", oneList.includes(162));
    }

    @Test public void testInsertBefore() {

        LinkedList oneList  = new LinkedList();
        oneList.insert(10);
        oneList.insert(9);
        oneList.insert(8);
        oneList.insert(12);
        oneList.insert(3);
        oneList.insertBefore(9, 162);
        oneList.print();


    }

    @Test public void testInsertAfter() {
        LinkedList oneList  = new LinkedList();
        oneList.insert(10);
        oneList.insert(9);
        oneList.insert(8);
        oneList.insert(12);
        oneList.insert(3);
        oneList.insertAfter(9, 162);
        oneList.print();
    }

    @Test public void testKFromEnd(){
        LinkedList oneList  = new LinkedList();
        oneList.insert(10);
        oneList.insert(9);
        oneList.insert(8);
        oneList.insert(12);
        oneList.insert(3);
        oneList.insert(5);

        //test that the kth value is as expected. returns -1 if not in list.
        assertEquals(10, oneList.kFromEnd(0));
        assertEquals(9, oneList.kFromEnd(1));
        assertEquals(8, oneList.kFromEnd(2));
        assertEquals(12, oneList.kFromEnd(3));
        assertEquals(3, oneList.kFromEnd(4));
        assertEquals(5, oneList.kFromEnd(5));
        assertEquals(-1, oneList.kFromEnd(6));
        assertEquals(-1, oneList.kFromEnd(-1));
    }
}