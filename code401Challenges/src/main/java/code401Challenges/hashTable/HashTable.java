package code401Challenges.hashTable;

import java.util.LinkedList;

public class HashTable<T> {

    private Node[] map;

    public HashTable(int size) {
        map = new Node[size];
    }

    public int hash(String key) {
        int hashValue = 0;
        char[] letters = key.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            hashValue += letters[i];
        }
        hashValue = (hashValue * 599) % map.length;
        return hashValue;
    }

    public void add(String key, T value) {
        int index = hash(key);

        if (this.map[index] == null) {
            map[index] = new Node(key,value);
        }
        else {
            Node temp = map[index];
            map[index] = new Node(key,value);
            map[index].setNext(temp);
        }
    }
    public T get(String key){
        int index = hash(key);
        Node<T> temp = map[index];
        while(temp != null){
            if (temp.getKey().equals(key)){
                return temp.getValue();
            }else{
                temp = temp.getNext();
            }
        }
        return null;
    }
    public boolean contains(String key){
        int index = hash(key);
        Node<T> temp = map[index];
        while(temp !=null){
            if(temp.getKey().equals(key)){
                return true;
            }else{
                temp = temp.getNext();
            }
        }
        return false;
    }
}
