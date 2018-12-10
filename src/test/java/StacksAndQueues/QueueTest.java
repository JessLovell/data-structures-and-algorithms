package StacksAndQueues;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class QueueTest {

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

    @Test public void testQueue() {
        Queue queue = new Queue();
        assertEquals("Expect front to be null", null, queue.front);
        assertEquals("Expect end to be null", null, queue.end);

        Node newNode = new Node(12, null);
        Node twoNode = new Node(18, null);
        queue.front = newNode;
        queue.end = twoNode;
        assertEquals("expect front to have 12", 12, (int)queue.front.data);
        assertEquals("expect front to have 18", 18, (int)queue.end.data);
    }

    @Test public void testEnqueue(){
        Queue queue = new Queue();
        assertEquals("Expect front to be null", null, queue.front);
        assertEquals("Expect end to be null", null, queue.end);
        queue.enqueue(12);
        assertEquals("Expect front to be 12", 12, (int)queue.front.data);
        assertEquals("Expect end to be 12", 12, (int)queue.end.data);
        queue.enqueue(19);
        queue.enqueue(0);
        assertEquals("Expect front to be 12", 12, (int)queue.front.data);
        assertEquals("Expect end to be 0", 0, (int)queue.end.data);
    }

    @Test public void testDequeue() {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        assertEquals("Expect front to be 1", 1, (int)queue.front.data);
        assertEquals("Expect end to be 6", 6, (int)queue.end.data);
        assertEquals("Expect dequeue to return 1", 1, queue.dequeue());
        assertEquals("Expect front to be 2", 2, (int)queue.front.data);
        assertEquals("Expect dequeue to return 2", 2, queue.dequeue());
        assertEquals("Expect front to be 3", 3, (int)queue.front.data);
        assertEquals("Expect dequeue to return 3", 3, queue.dequeue());
        assertEquals("Expect dequeue to return 4", 4, queue.dequeue());
        assertEquals("Expect dequeue to return 5", 5, queue.dequeue());
        assertEquals("Expect dequeue to return 6", 6, queue.dequeue());
        assertEquals("Expect dequeue to return null", null, queue.dequeue());
    }

    @Test public void testPeek() {
        Queue queue = new Queue();
        assertEquals("Expect peek to be null", null, queue.peek());
        queue.enqueue(1);
        assertEquals("Expect peek to be 1", 1, (int)queue.peek().data);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        assertEquals("Expect peek to be 1", 1, (int)queue.peek().data);
        assertEquals("expect peek to equal front", queue.peek(), queue.front);

    }
}