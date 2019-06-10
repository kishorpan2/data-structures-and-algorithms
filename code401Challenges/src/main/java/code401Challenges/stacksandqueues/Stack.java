package code401Challenges.stacksandqueues;

public class Stack<K>{
    protected Node top;
    public Stack() {
        this.top = null;
    }
    // this method will add a new node to the top of the stack

    public void push(K value){
        Node<K> newNode = new Node(value, this.top);
        this.top = newNode;
    }
    // this method will pop remove node from the top of the stack and returns it

    public K pop(){
        if (this.top != null){
            Node<K> temp = this.top;
            this.top = temp.next;
            return temp.value;
        } else {

            return null;
        }
    }
    // this method returns the node located at the top of the stack
    public Node<K> peek(){
        if(this.top == null){
            return null;
        }else{
            return this.top;
        }
    }

}
