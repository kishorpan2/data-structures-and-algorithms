package code401Challenges.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {
    BinarySearchTree classUnderTest;
    Node<Integer> root;
    @Before
    public void testInstantiate(){
        classUnderTest = new BinarySearchTree();
    }
    @Test
    public void testEmpty() {

     assertNull("", classUnderTest.getRoot());
    }
    @Test
    public void testSingle(){
        classUnderTest.add(10);
        assertTrue("" ,classUnderTest.contains(10));
    }
    @Test
    public void testMulti(){
        classUnderTest.add(1);
        classUnderTest.add(11);
        classUnderTest.add(111);
        classUnderTest.add(1111);
        assertTrue("",classUnderTest.contains(111));
    }
}