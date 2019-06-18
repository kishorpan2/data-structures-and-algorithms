package code401Challenges.FizzBuzzTree;

import code401Challenges.tree.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {
    FizzBuzzTree classUnderTest = new FizzBuzzTree();
    Node<String> root = new Node<String>("3");

    @Test
    public void happyPath(){
        String outPut = "Fizz";
        assertEquals("Two strings are the same", outPut, classUnderTest.fizzbuzz(root).getValue());
    }
    @Test
    public void sadPath(){
        String outPut = "Buzz";
        assertNotEquals("Two strings are not the same", outPut, classUnderTest.fizzbuzz(root).getValue());
    }
    @Test
    public void edgePath(){
        Node<String> rootR = new Node<String>("15");
        root.setRightChild(rootR);
        String outPut = "FizzBuzz";
        assertEquals("", outPut, classUnderTest.fizzbuzz(root).getRightChild().getValue());
    }

}