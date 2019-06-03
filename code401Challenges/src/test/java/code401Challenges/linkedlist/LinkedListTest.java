package code401Challenges.linkedlist;

import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void testEmpty(){
        LinkedList firstList = new LinkedList();
        Objects output =null;
       assertEquals("",firstList.head, output);

    }
    @Test
    public void testInsert(){
        LinkedList firstList = new LinkedList();
        firstList.insert(15);
        assertEquals("this should output",15,firstList.head.data);

        firstList.insert(150);
        assertEquals("this should output",150,firstList.head.data);
     }
     @Test
    public void testIncludes(){
         LinkedList firstList = new LinkedList();
         firstList.insert(16);
         firstList.insert(5);
         firstList.insert(115);
         assertTrue("Expect true", firstList.includes(115) );
     }
     @Test
     public void testDoesIncludes() {
         LinkedList firstList = new LinkedList();
         firstList.insert(16);
         firstList.insert(5);
         firstList.insert(115);
         assertFalse("Expect true", firstList.includes(200));
     }

     @Test
    public void testPrint(){
        LinkedList firstList = new LinkedList();
        firstList.insert(1);
        firstList.insert(15);
        firstList.insert(1115);
        assertEquals("It should pass the test",firstList.print().get(0).data,1115);

    }

}