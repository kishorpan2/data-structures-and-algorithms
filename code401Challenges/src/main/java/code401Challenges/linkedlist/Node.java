package code401Challenges.linkedlist;

public class Node <K>{
    // Instance variables
    public K data;
    public Node next;

    // Constructor
    public Node(K data, Node next){
        this.data = data;
        this.next =next;
    }
}
