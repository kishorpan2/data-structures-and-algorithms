package code401Challenges.stacksandqueues;

import org.junit.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void testStack(){
        Stack stack = new Stack();
        assertTrue("Expect null",stack.top == null);

        Node newNode = new Node(15,null);
        stack.top = newNode;
        assertTrue("Should have a new top", stack.top.value != null);
        assertTrue("Should have 12",(int) stack.top.value == 15);
    }

    @Test
    public void testPush(){
        Stack stack = new Stack();
        assertTrue("It Should be null",stack.top == null);
        stack.push(20);
        assertTrue("It Should be 20",(int)stack.top.value == 20);
        stack.push(30);
        assertTrue("It Should be 30",(int)stack.top.value == 30);
        stack.push(40);
        assertTrue("It Should be 40",(int)stack.top.value == 40);
        stack.push(50);
        assertTrue("It Should be 50",(int)stack.top.value == 50);

    }
    @Test
    public void testPop(){
        Stack stack = new Stack();
        stack.push(12);
        stack.push(13);
        stack.push(10);
        stack.push(45);

        assertTrue("This should have 45",(int)stack.top.value == 45);
        assertEquals("This should pop 45", 45, (int)stack.pop());
        assertTrue("This should have 10",(int)stack.top.value == 10);
        assertEquals("This should pop 10", 10, (int)stack.pop());
        assertTrue("This should have 13",(int)stack.top.value == 13);
        assertEquals("This should pop 13",13, (int)stack.pop());
        assertTrue("This should have 12",(int)stack.top.value == 12);
        assertEquals("This should pop 12",12, (int)stack.pop());

        assertEquals("This should have null", null, stack.pop());

    }
    @Test
    public void testPeek(){
        Stack stack = new Stack();
        assertTrue("It Should be null",stack.top == null);
        assertTrue("It Should be null",stack.peek() == null);
        stack.push(20);
        stack.push(30);
        assertTrue("This should have 20",(int)stack.top.value == 30);
        assertTrue("This should show 20",(int)stack.peek().value == 30);


    }




}