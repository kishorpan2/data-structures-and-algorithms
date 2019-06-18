package code401Challenges.FizzBuzzTree;

import code401Challenges.tree.Node;

public class FizzBuzzTree {
    public Node<String> fizzbuzz(Node<String> root){
        try{
            if(root ==null){
                return null;
            }else{
                if(Integer.parseInt(root.getValue())%5 ==0 && Integer.parseInt(root.getValue())% 3 ==0){
                    root.setValue("FizzBuzz");


            } else if(Integer.parseInt(root.getValue())%3 ==0){
                root.setValue("Fizz");

            } else if(Integer.parseInt(root.getValue())%5 ==0) {
                    root.setValue("Buzz");
                }

                fizzbuzz(root.getLeftChild());
                fizzbuzz(root.getRightChild());
                return root;
                }
        } catch (NumberFormatException e){
            System.out.println("Cannot perform");
            return null;
        }
    }
}
