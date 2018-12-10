package StacksAndQueues;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class StackTest {
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

    @Test public void testStack() {
        Stack stack = new Stack();
        assertTrue("Expect top to be null", stack.top == null);

        Node newNode = new Node(12, null);
        stack.top = newNode;
        assertTrue("Expect to have a new top", stack.top.data != null);
        assertTrue("Expect to have a new top = 12", (int) stack.top.data == 12);
    }

    @Test public void testPush() {

        Stack stack = new Stack();
        assertTrue("expect top to be null", stack.top == null);
        stack.push(12);
        assertTrue("expect top to be 12", (int)stack.top.data == 12);
        stack.push(17);
        assertTrue("expect top to be 17", (int)stack.top.data == 17);
        stack.push(14);
        assertTrue("expect top to be 14", (int)stack.top.data == 14);
    }

    @Test public void testPop() {
        Stack stack = new Stack();
        stack.push(12);
        stack.push(17);
        stack.push(14);
        assertTrue("expect top to be 14", (int)stack.top.data == 14);
        assertEquals("Expect 14 to be returned", 14, (int)stack.pop());
        assertTrue("expect top to be 17", (int)stack.top.data == 17);
        assertEquals("Expect 17 to be returned", 17, (int)stack.pop());
        assertTrue("expect top to be 12", (int)stack.top.data == 12);
        assertEquals("Expect 12 to be returned", 12, (int)stack.pop());
        assertTrue("expect top to be null", stack.top == null);
        assertTrue("Expect pop to return null", stack.pop() == null);
    }

    @Test public void testPeek() {
        Stack stack = new Stack();
        assertTrue("expect top to be null", stack.top == null);
        assertTrue("expect Peek to return null", stack.peek() == null);
        stack.push(20);
        assertTrue("expect top to be 20", (int)stack.top.data == 20);
        assertTrue("expect Peek to return 20", (int)stack.peek().data == 20);
        stack.push(20);
        stack.push(20);
        stack.push(20);
        stack.push(20);
        stack.push(180);
        assertTrue("expect top to be 180", (int)stack.top.data == 180);
        assertTrue("expect Peek to return 180", (int)stack.peek().data == 180);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        assertTrue("expect top and peek to equal", (int)stack.top.data == (int)stack.peek().data);
        stack.pop();
        stack.pop();
        assertTrue("expect top to be null", stack.top == null);
        assertTrue("expect Peek to return null", stack.peek() == null);
    }

    @Test public void testPrint() {
        Stack stack = new Stack();
        stack.push(12);
        stack.push(17);
        stack.push(14);
        stack.print();


        Stack pancakes = new Stack();
        pancakes.push( 200);
        pancakes.push(405);
        pancakes.push(2017);
        pancakes.print();

        assertEquals("14 17 12 \n2017 405 200 \n", outContent.toString());
    }
}