package code401Challenges.tree;

import code401Challenges.BiniarySearch;

public class BinarySearchTree {

    Node<Integer> root;

    public BinarySearchTree() {
        root = null;
    }

    public Node<Integer> getRoot() {
        return root;
    }

    public void setRoot(Node<Integer> root) {
        this.root = root;
    }

    public void add(Integer value) {

        Node<Integer> temp = new Node<>();

        temp.setValue(value);

        if (root == null) {
            setRoot(temp);
        } else {
            Node<Integer> iterator = root;
            while (iterator.getLeftChild() != null && iterator.getRightChild() != null) {
                if (value < iterator.getValue()) {
                    iterator = iterator.getLeftChild();

                } else if (value > iterator.getValue()) {
                    iterator = iterator.getRightChild();

                } else {
                    System.out.println("No duplocates allowed");
                    break;
                }
            }
            if (iterator.getLeftChild() == null) {
                iterator.setLeftChild(temp);
            } else {
                iterator.setRightChild(temp);
            }

        }

    }

    public boolean contains(Integer value) {
        if (root == null)
            return false;
            Node<Integer> temp = root;
            while (temp != null) {
                if (temp.getValue() == value)
                    return true;
                if (value > temp.getValue()) {
                    temp = temp.getRightChild();
                } else if (value < temp.getValue()) {
                    temp = temp.getLeftChild();
                }
            }
            return false;
        }

}

