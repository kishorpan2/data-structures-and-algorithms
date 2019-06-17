package code401Challenges.tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test
    public void binaryTreeTest(){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(50);
    assertTrue("This should return the root as 50",(int)tree.root.value == 50);
    }

    @Test
    public void testPreOrder(){
        Node node1 = new Node(4);
    Node node2 = new Node(2);
    Node node3 = new Node(3);


    node1.leftChild = node2;
    node1.rightChild = node3;

        BinaryTree tree = new BinaryTree();
        List list = null;

        assertEquals("",list,tree.order("pre"));

    }



}