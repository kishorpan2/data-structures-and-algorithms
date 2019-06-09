package code401Challenges.linkedlist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Objects;

import static code401Challenges.linkedlist.LinkedList.mergeTwo;
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
        assertEquals("this should output",15,firstList.head.value);

        firstList.insert(150);
        assertEquals("this should output",150,firstList.head.value);
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

        int[] outPut = {1115,15,1};
        assertEquals("It should pass the test",outPut.length,firstList.print().length );

    }
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
    @Test
    public void testInsertBefore() {
        LinkedList firstList = new LinkedList();
        firstList.insert(10);
        firstList.insert(9);
        firstList.insert(8);
        firstList.insert(12);
        firstList.insert(3);
        firstList.insertBefore(10, 162);
        int[] resultArr = firstList.print();
        int expectedOutPut = 162;
        assertEquals("expect 162 before 9,",expectedOutPut,resultArr[4]);
    }
    @Test
    public void testInsertAfter() {
        LinkedList firstList = new LinkedList();
        firstList.insert(10);
        firstList.insert(9);
        firstList.insert(8);
        firstList.insert(12);
        firstList.insert(3);
        firstList.insertAfter(10, 162);
        int[] resultArr = firstList.print();
        int expectedOutPut = 162;
        assertEquals("expect 162 before 9,",expectedOutPut,resultArr[5]);
    }
    @Test
    public void testKthNullValue(){
        LinkedList firstList = new LinkedList();
        firstList.insert(10);
        firstList.kFromEnd(2);
    }
    @Test
    public void testKthEqualValue(){
        LinkedList firstList = new LinkedList();
        firstList.insert(10);
        firstList.kFromEnd(1);
    }
    @Test
    public void testKthNegValue(){
        LinkedList firstList = new LinkedList();
        firstList.insert(10);
        firstList.kFromEnd(-1);
    }
        @Test
        public void testKthOneValue(){
            LinkedList firstList = new LinkedList();
            firstList.insert(3);

           int  outPut =3;
           assertEquals("",outPut,firstList.kFromEnd(0));

    }
    @Test
    public void testKthMultiValue(){
        LinkedList firstList = new LinkedList();
        firstList.insert(13);
        firstList.insert(23);
        firstList.insert(33);
        firstList.insert(43);
        firstList.insert(53);
        firstList.insert(63);


        int  outPut =53;
        assertEquals("",outPut,firstList.kFromEnd(4));

    }
    @Test
    public void testMergedBothEmpty(){
        LinkedList firstList = new LinkedList();

        LinkedList secList = new LinkedList();

        Node newH =  mergeTwo(firstList, secList);
        ArrayList <Integer> resultArr = new ArrayList<>();
        Node current = newH;
        while(current != null){
            resultArr.add(current.value);
            current = current.next;
        }
        Object[] outPut ={};
        assertArrayEquals("This should zip output", outPut,resultArr.toArray() );
    }

    @Test
    public void testMergedListOneEmpty(){
        LinkedList firstList = new LinkedList();
        firstList.append(1);
        firstList.append(3);
        firstList.append(5);
        firstList.append(7);
        LinkedList secList = new LinkedList();

        Node newH =  mergeTwo(firstList, secList);
        ArrayList <Integer> resultArr = new ArrayList<>();
        Node current = newH;
        while(current != null){
            resultArr.add(current.value);
            current = current.next;
        }
        Object[] outPut ={1,3,5,7};
        assertArrayEquals("This should zip output", outPut,resultArr.toArray() );
    }
    @Test
    public void testMergedListNoneEmpty(){
        LinkedList firstList = new LinkedList();
        firstList.append(1);
        firstList.append(3);
        firstList.append(5);
        firstList.append(7);

        LinkedList secList = new LinkedList();
        secList.append(2);
        secList.append(4);
        secList.append(6);
        secList.append(8);

        Node newH =  mergeTwo(firstList, secList);
        ArrayList <Integer> resultArr = new ArrayList<>();
        Node current = newH;
        while(current != null){
            resultArr.add(current.value);
            current = current.next;
        }
        Object[] outPut ={1,2,3,4,5,6,7,8};
        assertArrayEquals("This should zip output", outPut,resultArr.toArray() );
    }

}