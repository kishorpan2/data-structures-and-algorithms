package code401Challenges.tree;

public class Node<K> {

    public K value;
    public Node<K> leftChild;
    public Node<K> rightChild;

    public Node(){
        this.value = null;
        this.leftChild = null;
        this.rightChild = null;
    }
    public Node(K value){
        this.value=value;
    }
    public K getValue(){
        return this.value;
    }
    public void setValue( K value){
         this.value=value;
    }
    public Node<K>getLeftChild(){
        return this.leftChild;
    }
    public void setLeftChild(Node<K> leftChild){
        this.leftChild =leftChild;
    }
    public Node<K>getRightChild(){
        return this.rightChild;
    }
    public void setRightChild(Node<K> rightChild){
        this.rightChild =rightChild;
    }



}
