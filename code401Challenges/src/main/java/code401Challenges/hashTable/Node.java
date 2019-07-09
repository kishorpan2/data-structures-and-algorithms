package code401Challenges.hashTable;

public class Node<T> {
    private String key;
    public T value;
    public Node<T> next;

    public void setNext(Node node) {
        this.next = node;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(T value) {
        this.value = value;
    }
    public String getKey(){
        return key;
    }
    public Node<T> getNext(){
        return next;
    }
    public T getValue(){
        return value;
    }

    public Node(String key, T value) {
        this.key =key;
        this.value =value;
        this.next=null;
    }
}
