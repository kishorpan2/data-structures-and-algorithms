package code401Challenges.stacksandqueues;

public class Queue<K> {
    protected Node front;
    protected Node end;

    public Queue(){
        this.front = end;
        this.end = null;
    }
    //This method adds node to the end of the queue
    public void enqueue(K value){
        Node newNode = new Node(value, null);
        if(this.front ==null){
           this.front = newNode;
           this.end = newNode;
        }
        else{
            this.end.next = newNode;
            this.end = this.end.next;
        }
    }
    //This method removes node to the front of the queue
    public K dequeue(){
        if(this.front != null){
            Node<K> temp = this.front;
            this.front = temp.next;
            return temp.value;
        }else{
            return null;
        }
    }
    //This method returns the value of the front
    public Node peek(){
        return this.front;
    }

}
