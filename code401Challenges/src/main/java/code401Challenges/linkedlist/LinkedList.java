package code401Challenges.linkedlist;


import java.util.ArrayList;

public class LinkedList {
    // Instance variable
    public Node head;

    // Constructor
    public LinkedList(){
        this.head = null;
    }

//this method will insert any value at the head of the linked list
    public void insert(int value){
         Node newNode = new Node(value, this.head);

// set head to point new node
        this.head = newNode;
    }
// checks if there is a value in the LinkedList
    public boolean includes(int value){

        // find the head
        Node current = this.head;

        while(current != null){
            if(value == current.data){
                return true;
            }else { current = current.next;
        }
    }
        return false;
}
//returns a collection all of the current Node values in the Linked List
    public ArrayList<Node>print(){

        // find the head
        Node current = this.head;
        ArrayList<Node> printerArr= new ArrayList<>();

        while(current != null){
            printerArr.add(current);
            current = current.next;
            System.out.println(current);
        }

        return printerArr;
    }

}
