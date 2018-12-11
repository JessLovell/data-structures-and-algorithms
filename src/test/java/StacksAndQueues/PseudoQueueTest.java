package StacksAndQueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test public void testPseudoQueue() {

        PseudoQueue test = new PseudoQueue();
        assertEquals("Expect enQ to be null", null, test.enQ.peek());
        assertEquals("Expect deQ to be null", null, test.deQ.peek());

        test.enqueue(13);
        test.enqueue(197);
        assertTrue("Expect enQ to not null", null != test.enQ);
        test.dequeque();
        assertTrue("Expect deQ to not null", null != test.deQ);
    }

    @Test
    public void testEnqueue() {

        PseudoQueue test = new PseudoQueue();
        test.enqueue(13);
        assertEquals("expect enQ.peek to have 13", 13, test.enQ.peek().data);
        test.enqueue(197);
        assertEquals("expect enQ.peek to have 197", 197, test.enQ.peek().data);
        test.enqueue("string");
        assertEquals("expect enQ.peek to have string", "string", test.enQ.peek().data);
        test.dequeque();
        assertEquals("expect enQ.peek to have 197", 197, test.deQ.peek().data);
        test.enqueue(2018);
        assertEquals("expect enQ.peek to have 2018", 2018, test.enQ.peek().data);
        test.enqueue(300);
        assertEquals("expect enQ.peek to have 300", 300, test.enQ.peek().data);
    }

    @Test
    public void testDequeque() {

        PseudoQueue test = new PseudoQueue();
        test.enqueue(13);
        test.enqueue(197);
        test.enqueue("string");
        test.enqueue(2018);
        test.enqueue(300);
        assertEquals("expect dequeue to return 13", 13, test.dequeque());
        assertEquals("expect dequeue to return 197", 197, test.dequeque());
        assertEquals("expect dequeue to return string", "string", test.dequeque());
        assertEquals("expect dequeue to return 2018", 2018, test.dequeque());
        assertEquals("expect dequeue to return 300", 300, test.dequeque());
        assertEquals("expect dequeue to return null", null, test.dequeque());
    }
}