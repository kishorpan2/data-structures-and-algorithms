package code401Challenges.stacksandqueues;

public class PseudoQueue<K> {
    protected Stack<K> enQ;
    protected Stack<K> deQ;
    public PseudoQueue(){
        this.enQ = new Stack<>();
        this.deQ = new Stack<>();
    }
    // This method will add node to the queue

    public void enqueue(K value){
        if (this.enQ.peek()==null && this.deQ.peek() ==null){
            this.enQ.push(value);
        } else {
            while(this.deQ.peek() != null) {
                this.enQ.push(this.deQ.pop());
            }
            this.enQ.push(value);
        }
    }

    // this method will remove first node
    public K dequeue(){
        if (this.enQ.peek()==null && this.deQ.peek() ==null){
            return null;
        } else if (this.enQ.peek()== null){
            return this.deQ.pop();

        } else {
            while(this.enQ.peek() != null){
                this.deQ.push(this.enQ.pop());
            }
            return this.deQ.pop();
        }
    }

}
