package code401Challenges.linkedlist;


import java.util.ArrayList;

public class LinkedList <K>{
    // Instance variable
    public Node <K>head;
    public int size;
    public Node <K> current;

    // Constructor
    public LinkedList(){
        this.head = null;
        this.size =0;
    }

//this method will insert any value at the head of the linked list
    public void insert(K value){
         Node <K> newNode = new Node(value, this.head);

// set head to point new node
        this.head = newNode;
        this.size++;
    }
// checks if there is a value in the LinkedList
    public boolean includes(K value){

        // find the head
        Node<K> current = this.head;

        while(current != null){
            if(current.data.equals(value)){
                return true;
            }else { current = current.next;
        }
    }
        return false;
}
//returns a collection all of the current Node values in the Linked List
    public void print(){

        // find the head
        Node <K> current = this.head;
        ArrayList<Node> printerArr= new ArrayList<>();

        while(current != null){
            printerArr.add(current);
            current = current.next;
            System.out.println(current.data);
        }


    }
// this method will insert to the end of the list
    public void append(K value){
        Node<K> current = this.head;

        while (current != null){
            if (current.next == null){
                Node<K> newNode = new Node(value, current.next);
                current.next = newNode;
                this.size++;
                return;
            }else{
                current = current.next;

            }
        }
    }
    // This method will insert in before a specific value
    public void insertBefore(K targetValue, K newValue){
        Node<K> current = this.head;

        while (current != null){
            if ((current.next).data == targetValue){
                Node<K> newNode = new Node(newValue, current.next);
                current.next = newNode;
                this.size++;
                return;
            }else{
                current = current.next;

            }
        }
    }
    public void insertAfter(K targetValue, K newValue){
        Node<K> current = this.head;

        while (current != null){
            if (current.next == targetValue){
                Node<K> newNode = new Node(newValue, current.next);
                current.next = newNode;
                this.size++;
                return;
            }else{
                current = current.next;

            }
        }

    }

    // this method will take in a value to insert from the end
    public int kFromEnd(int k) {
        Node<K>current = this.head;
        int size =0;
        while (current != null){
            size++;
            current = current.next;
        }
        int delK = size-k;
        if (delK <=0 || k< 0){
            return -1;
        }else{
            current = this.head;
            for(int i =0; i<delK; i++){
                if(i == delK-1){

                }else{
                    current = current.next;
                }
            }
        }
        return -1;
    }
}
