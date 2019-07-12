package code401Challenges.hashTable;

import code401Challenges.tree.Node;
import org.junit.Test;

import static org.junit.Assert.*;


public class TreeIntersectionTest {
    TreeIntersection test = new TreeIntersection();

    @Test
    public void firstTest(){
        Node<Integer> r1 = new Node(50);
        r1.setLeftChild(new Node(10));
        r1.setRightChild(new Node(20));
        r1.getLeftChild().setLeftChild(new Node(75));
        r1.getLeftChild().setRightChild(new Node(160));
        r1.getLeftChild().getRightChild().setLeftChild(new Node(25));
        r1.getLeftChild().getRightChild().setRightChild(new Node(105));
        r1.getRightChild().setRightChild(new Node(350));
        r1.getRightChild().setLeftChild(new Node(200));
        r1.getRightChild().getRightChild().setLeftChild(new Node(1300));
        r1.getRightChild().getRightChild().setRightChild(new Node(4500));


        Node<Integer> r2 = new Node(42);
        r2.setLeftChild(new Node(10));
        r2.setRightChild(new Node(20));
        r2.getLeftChild().setLeftChild(new Node(15));
        r2.getLeftChild().setRightChild(new Node(160));
        r2.getLeftChild().getRightChild().setLeftChild(new Node(12));
        r2.getLeftChild().getRightChild().setRightChild(new Node(15));
        r2.getRightChild().setRightChild(new Node(350));
        r2.getRightChild().setLeftChild(new Node(200));
        r2.getRightChild().getRightChild().setLeftChild(new Node(4));
        r2.getRightChild().getRightChild().setRightChild(new Node(500));

        String expectedOutput = "[50, 10, 75, 160, 25, 105, 20, 200, 350, 1300, 4500]";

        assertEquals("This should return true if values are intersecting ", expectedOutput, test.treeIntersection(r1, r2).toString() );
    }









}



