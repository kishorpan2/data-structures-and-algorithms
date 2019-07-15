package code401Challenges.Graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {
    @Test
    public void testAddNode(){
        Graph one = new Graph();
        assertEquals("expect size 0",0,one.size());

        Node oneNode = one.addNode(1);
        one.addNode(11);
        one.addNode(111);
        one.addNode(1111);
        one.addNode(11111);
        one.addNode(111111);

        assertEquals("expect size 6",6,one.size());

    }
    @Test
    public void testAddEdge(){
        Graph one = new Graph();

        Node oneNode = one.addNode(1);
        Node twoNode = one.addNode(11);
        Node threeNode = one.addNode(111);

        one.addEdge(oneNode, twoNode);
      assertEquals("expect to have neighbor size one",1,oneNode.neighbors.size());
      assertEquals("expect to have neighbor size one",1,twoNode.neighbors.size());
      assertEquals("expect to have neighbor size 0",0,threeNode.neighbors.size());



        }
      @Test
    public void testAddEdgee(){
        Graph one = new Graph<>();

        Node oneNode = one.addNode(1);
        Node twoNode = one.addNode(11);
        Node threeNode = one.addNode(111);

        one.addEdge(oneNode, twoNode);
      assertEquals("expect 1 to have neighbor size one",1,oneNode.neighbors.size());
      assertEquals("expect 11 to have neighbor size one",1,twoNode.neighbors.size());
      assertEquals("expect 111 to have neighbor size 0",0,threeNode.neighbors.size());
  }
      @Test
      public void testGetNodes(){
      Graph graph = new Graph<>();
      Node one = graph.addNode(1);
      Node two = graph.addNode(11);

      graph.addEdge(two, graph.addNode(15));
      }
    @Test
    public void testSize(){
        Graph graph = new Graph();
        graph.addNode(1);
        graph.addNode(1);
        graph.addNode(1);
        assertEquals("expect yo gave size 3",3,graph.size());
    }
}