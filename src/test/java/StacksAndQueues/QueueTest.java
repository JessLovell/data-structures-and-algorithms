package StacksAndQueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    @Test public void testEnqueue(){
        Queue queue = new Queue();
        queue.enqueue(12);
        queue.enqueue(19);
        queue.enqueue(0);
        queue.print();
//        queue.dequeue();
//        queue.print()
    }

}