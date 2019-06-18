package code401Challenges.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<K> {

    public Node<K> root;


    public BinaryTree(){
        this.root = null;
    }
    public BinaryTree(Node<K> head ){
        root= head;
    }
    public Node<K> getRoot(){
        return root;
    }
    public void setRoot(Node<K> root){
        this.root = root;
    }

    // preOrder

    public ArrayList<K> preOrder( Node<K> node) {
        ArrayList<K> list = new ArrayList<>();
        preOrderHelper(node, list);
        return list;

    }

    // inOrder
    public ArrayList<K> inOrder( Node<K> node) {
        ArrayList<K> list = new ArrayList<>();
        inOrderHelper(node, list);
        return list;

    }

    //postOrder
    public ArrayList<K> postOrder( Node<K> node) {
        ArrayList<K> list = new ArrayList<>();
        postOrderHelper(node, list);
        return list;

    }


    public void preOrderHelper(Node<K> node,ArrayList<K>list){
        try{
            if(node == null){
                return;
            }else{
                list.add(node.getValue());
                preOrderHelper(node.getLeftChild(),list);
                preOrderHelper(node.getRightChild(),list);

            }
        }catch (NullPointerException e ){
                System.out.println("this root is null");
                System.out.println(e);


        }
    }
    public void inOrderHelper(Node<K> node,ArrayList<K>list){
        try{
            if(node == null){
                return;
            }else{

                inOrderHelper(node.getLeftChild(),list);
                list.add(node.getValue());
                inOrderHelper(node.getRightChild(),list);

            }
        }catch (NullPointerException e ){
            System.out.println("this root is null");
            System.out.println(e);


        }
    }
    public void postOrderHelper(Node<K> node,ArrayList<K>list){
        try{
            if(node == null){
                return;
            }else{

                postOrderHelper(node.getLeftChild(),list);
                postOrderHelper(node.getRightChild(),list);
                list.add(node.getValue());

            }
        }catch (NullPointerException e ){
            System.out.println("this root is null");
            System.out.println(e);


        }
    }

}
