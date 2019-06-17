package code401Challenges.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<K> {

    public Node<K> root;


    public BinaryTree(){
        this.root = null;
    }
    // this method will determine if it is preOrder, inOrder and postOrder

    public List order(String order){
        List list = new ArrayList <>();

        if(order.toUpperCase().startsWith("pre")){
            list = preOrder(list, this.root);
        }
        else if(order.toUpperCase().startsWith("in")){
            list = inOrder(list, this.root);
        }
        else if (order.toUpperCase().startsWith("post")){
            list = postOrder(list, this.root);
        }
        else{
            return null;
        }
        return list;
    }

    // preOrder
    public List<K> preOrder(List<K> list, Node<K> node) {
        list.add(node.value);

        if (node.leftChild != null){
            preOrder(list, node.leftChild);

        }
        if(node.rightChild != null){
            preOrder(list, node.rightChild);

        }

        return list;

    }

    // inOrder
    public List<K> inOrder(List<K> list, Node<K> node) {
        list.add(node.value);

        if (node.leftChild != null){
            inOrder(list, node.leftChild);

        }
        if(node.rightChild != null){
            inOrder(list, node.rightChild);

        }

        return list;

    }


    // postOrder
    public List<K> postOrder(List<K> list, Node<K> node) {
        list.add(node.value);

        if (node.leftChild != null){
            postOrder(list, node.leftChild);

        }
        if(node.rightChild != null){
            postOrder(list, node.rightChild);

        }
        return list;
    }

}
