package code401Challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {
    @Test
    public void testPseudoQueue(){
        PseudoQueue test = new PseudoQueue();
        assertEquals("expect null", null,test.enQ.peek());
        assertEquals("expect null", null,test.deQ.peek());
        test.enqueue(19);
        test.enqueue(54);
        assertTrue("This should not be null", null!= test.enQ);
        assertTrue("This should not be null", null!= test.deQ);
    }

    @Test
    public void testEnqueue(){
        PseudoQueue test = new PseudoQueue();
        test.enqueue(19);

        assertEquals("",19,test.enQ.peek().value);
        test.enqueue(199);
        assertEquals("",199,test.enQ.peek().value);
        test.enqueue(1999);
        assertEquals("",1999,test.enQ.peek().value);
        test.enqueue(19999);
        assertEquals("",19999,test.enQ.peek().value);
        test.enqueue(199999);
        assertEquals("",199999,test.enQ.peek().value);

    }

    @Test
    public void testDequeue(){
        PseudoQueue test = new PseudoQueue();
        test.enqueue(19);
        test.enqueue(2020);
        test.enqueue(21);
        test.enqueue(22);
        test.enqueue(23);
        test.enqueue(24);
        assertEquals("",19,test.dequeue());
        assertEquals("",2020,test.dequeue());
        assertEquals("",21,test.dequeue());
        assertEquals("",22,test.dequeue());
        assertEquals("",23,test.dequeue());
        assertEquals("",24,test.dequeue());
        assertEquals("",null,test.dequeue());

    }
}