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

//     @Test
//    public void testPrint(){
//        LinkedList firstList = new LinkedList();
//        firstList.insert(1);
//        firstList.insert(15);
//        firstList.insert(1115);
//
//
//        assertEquals("It should pass the test",1115,testPrint(firstList(0)));
//
//    }
    @Test
    public void testAppend(){
    LinkedList firstList = new LinkedList();
    firstList.insert(13);
    firstList.insert(23);
    firstList.insert(33);
    firstList.insert(43);
    firstList.insert(53);
    firstList.insert(63);
    firstList.insert(73);
    firstList.insert(83);

    assertTrue("This should contain, 43", firstList.includes(13));
    assertTrue("This should contain, 43", firstList.includes(23));
    assertTrue("This should contain, 43", firstList.includes(33));
    assertTrue("This should contain, 43", firstList.includes(43));
    assertTrue("This should contain, 43", firstList.includes(53));
    assertTrue("This should contain, 43", firstList.includes(63));
    assertTrue("This should contain, 43", firstList.includes(73));
    }
//    @Test
//    public void testInsertBefore() {
//        LinkedList firstList = new LinkedList();
//        firstList.insert(10);
//        firstList.insert(9);
//        firstList.insert(8);
//        firstList.insert(12);
//        firstList.insert(3);
//
//        firstList.insertBefore(9, 162);
//        firstList.print();
//        assertEquals("expect 162 before 9,");
//    }

}