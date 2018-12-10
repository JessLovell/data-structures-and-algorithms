package StacksAndQueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void testPush() {
        Stack stack = new Stack();
        stack.push(12);
        stack.push(17);
        stack.push(14);
        stack.print();

        stack.pop();
        stack.print();
    }
}