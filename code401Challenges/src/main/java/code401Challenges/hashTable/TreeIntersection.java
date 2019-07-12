package code401Challenges.hashTable;

import code401Challenges.tree.Node;
import java.util.ArrayList;
import java.util.HashMap;

public class TreeIntersection {
    public ArrayList<Integer> treeIntersection(Node r1, Node r2) {
        ArrayList<Integer> intersectionArrayList = new ArrayList<>();
        if (r1 == null) {
            return intersectionArrayList;
        }
        if (r2 == null) {
            return intersectionArrayList;
        }
        HashMap<Integer, Integer> firstHash = new HashMap<>();
        int count = 0;

            firstTree(r1,firstHash,count);
            secondTree(r1,firstHash,count,intersectionArrayList);

        return intersectionArrayList;

    }

    private void firstTree(Node<Integer> node,HashMap<Integer,Integer> firstHash,int count){
        if(node ==null){
            return;
        }
        else{
            count++;
            if(firstHash.get(node.getValue())== null){
                firstHash.put(node.getValue(),count);
            }
            firstTree(node.getLeftChild(),firstHash,count);
            firstTree(node.getRightChild(),firstHash,count);
        }
    }
    private void secondTree(Node<Integer> node,HashMap<Integer,Integer> firstHash,int count, ArrayList<Integer> intersectionArrayList){
        if(node ==null){
            return;
        }
        else{
            count++;
            if(firstHash.get(node.getValue())!= null){
                intersectionArrayList.add(node.getValue());
            }
            secondTree(node.getLeftChild(),firstHash,count,intersectionArrayList);
            secondTree(node.getRightChild(),firstHash,count,intersectionArrayList);
        }
    }
}
