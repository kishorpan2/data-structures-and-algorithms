package code401Challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    @Test
    public void testQueue() {
        Queue queue = new Queue();
        assertEquals("This should have null front", null, queue.front);
        assertEquals("This should have null end", null, queue.end);

        Node newNode = new Node(1, null);
        Node secNode = new Node(3, null);

        queue.front = newNode;
        queue.end = secNode;

        assertEquals("This should have 1 at front", 1, queue.front.value);
        assertEquals("This should have 3 at end", 3, queue.end.value);


    }

    @Test
    public void testEnqueue() {
        Queue queue = new Queue();
        assertEquals("This should have null front", null, queue.front);
        assertEquals("This should have null end", null, queue.end);

        queue.enqueue(12);
        assertEquals("This should have 12 at the front", 12, queue.front.value);
        queue.enqueue(15);
        assertEquals("This should have 15 as the end value", 15, queue.end.value);
    }

    @Test
    public void testDequeue() {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(11);
        queue.enqueue(111);
        queue.enqueue(1111);
        queue.enqueue(11111);
        assertEquals("This should have 1 as front value", 1, (int) queue.front.value);
        assertEquals("This should have 11111 as end value", 11111, (int) queue.end.value);
        assertEquals("This should dequeue 1", 1, queue.dequeue());
        assertEquals("This should have 11 as front value", 11, (int) queue.front.value);
        assertEquals("This should dequeue 11", 11, queue.dequeue());
        assertEquals("This should have 111 as front value", 111, (int) queue.front.value);
        assertEquals("This should dequeue 111", 111, queue.dequeue());
        assertEquals("This should give 1111 as a front value", 1111, (int) queue.front.value);
        assertEquals("This should dequeue 1111", 1111, queue.dequeue());
        assertEquals("This should have 1111 as front value", 11111, (int) queue.front.value);
        assertEquals("This should dequeue 11111", 11111, queue.dequeue());
        assertEquals("This should have null", null, queue.dequeue());
    }

    @Test
    public void testPeek() {
        Queue queue = new Queue();
        assertEquals("This should give a null",null,queue.peek());
        queue.enqueue(1);
        assertEquals("This should give 1 ",1,queue.peek().value);
        queue.enqueue(11);
        queue.enqueue(111);
        queue.enqueue(1111);

        assertEquals("",1,queue.peek().value);
    }
}