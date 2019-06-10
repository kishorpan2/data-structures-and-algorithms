package code401Challenges.stacksandqueues;

public class Node <K> {
        // Instance variables
        public K  value;
        Node next;

        // Constructor
        public Node(K value, Node next){
            this.value = value;
            this.next = next;
        }
    }

