package code401Challenges.tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class BinaryTreeTest {

    BinaryTree<Integer> classUnderTest;
    Node<Integer> root;
@Before
    public void binaryTreeTest(){

        classUnderTest = new BinaryTree<>();

        root = new Node<>(1);
        Node<Integer> treeL = new Node<>(2);
        Node<Integer> treeR = new Node<>(3);
        root.setLeftChild(treeL);
        root.setRightChild(treeR);
    }
    @Test
        public void testInstantiateEmpty(){

    assertNull("This should return null",classUnderTest.getRoot());
    }

    @Test
    public void testSingleRootNode(){
        root = new Node<>(5);
       classUnderTest.setRoot(root);
       Integer resultInt = 5;
       assertEquals("",resultInt, classUnderTest.root.getValue());

    }
    @Test
    public void testPreOrder(){
        classUnderTest.setRoot(root);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals("",list, classUnderTest.preOrder(root));

    }
    @Test
    public void testInOrder() {
        classUnderTest.setRoot(root);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        assertEquals("", list, classUnderTest.inOrder(root));
    }
        @Test
        public void testPostOrder(){
            classUnderTest.setRoot(root);
            ArrayList<Integer> list = new ArrayList<>();
            list.add(2);
            list.add(3);
            list.add(1);
            assertEquals("",list, classUnderTest.postOrder(root));

        }


    }






