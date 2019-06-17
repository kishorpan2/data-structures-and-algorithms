package code401Challenges.tree;

public class Node<K> {

    public K value;
    public Node<K> leftChild;
    public Node<K> rightChild;

    public Node(K value){
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }
}
