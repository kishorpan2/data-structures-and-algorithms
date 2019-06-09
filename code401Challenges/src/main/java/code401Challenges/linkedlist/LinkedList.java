package code401Challenges.linkedlist;


import java.util.ArrayList;

public class LinkedList {
    // Instance variable
    public Node head;
    int size;
    public Node current;

    // Constructor
    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    //this method will insert any value at the head of the linked list
    public void insert(int value) {
        Node current = new Node();
        current.value = value;
// set head to point new node
        try {
            if (this.head == null) {
                head = current;
                current.next = null;
            } else {
                current.next = head;
                head = current;
            }
            size += 1;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("This is out of bound exception");
        }
    }

    // checks if there is a value in the LinkedList
    public boolean includes(int value) {

        // find the head
        if (this.head == null) {
            return false;
        } else {
            Node current = head;

            while (current != null) {
                if (current.value == value) {
                    return true;
                } else {
                    current = current.next;
                }
            }
        }
        return false;
    }

    //returns a collection all of the current Node values in the Linked List
    public int[] print() {

        // find the head
        if (this.head == null) {
            return null;
        }
        int[] resultArr = new int[size];
        Node current = head;
        int count = 0;

        while (current != null) {
            resultArr[count] = current.value;
            current = current.next;
//            System.out.println(current.value);
            count++;
        }
        return resultArr;

    }

    // this method will insert to the end of the list
    public void append(int value) {
        Node current = new Node();
        current.value = value;
        current.next = null;

        if (this.head == null) {
            this.head = current;
        } else {
            Node node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = current;
        }
        this.size++;
    }

    // This method will insert in before a specific value
    public int insertBefore(int value, int newV) {
        if (this.head == null) {
            System.out.println("Error, the list is empty");
            return -1;
        } else if
        (this.head.value == value) {
            Node newValue = new Node();
            newValue.value = newV;
            newValue.next = this.head;
            this.head = newValue;
            this.size++;
            return 0;
        } else {
            Node current = head.next;
            Node previous = head;
            Node newValue = new Node();
            newValue.value = newV;
            while (current != null) {
                if (current.value == value) {
                    previous.next = newValue;
                    newValue.next = current;
                    this.size++;
                    return 0;
                } else {
                    previous = current;
                    current = current.next;
                }
            }
        }
        return -1;
    }

    // Add value in front of a specified value
    public void insertAfter(int value, int newVal) {
        if (this.head == null) {
            System.out.println("Error, the list is empty");
            return;
        } else {

            Node current = this.head;
            Node newValue = new Node();
            newValue.value = newVal;
            while (current != null) {
                if (current.value == value) {
                    newValue.next = current.next;
                    current.next = newValue;
                    this.size++;
                    return;
                } else {
                    current = current.next;

                }
            }

        }
        System.out.println("The LL does not contain");
        return;
    }

    // this method will take in a value to insert from the end
    public int kFromEnd(int value) {
        if (this.head == null) {
            throw new NullPointerException("This LinkedList is empty");
        } else if (value > this.size) {
            throw new IllegalArgumentException("the value you passed is greater than the LL");
        } else if (value == this.size) {
            throw new IllegalArgumentException("The value you passed is the same size of the Linked List");
        } else {
        }
        // delK represents the difference between the size of the Linked List and from the k th index

        int delK = size - value;
        int counter = 1;

        Node current = this.head;
        while (current != null) {
            if (delK == counter) {
                return current.value;

            } else {
                current = current.next;
                counter++;
            }
        }
        return -1;
    }

    // this method will be able to take 2 linked Lists and zip them together
    public static Node mergeTwo(LinkedList une, LinkedList un){
        if (une.head == null) {
            return un.head;
        } else if (un.head == null) {
            return une.head;
        } else {
            Node uneCurrent = une.head;
            Node unCurrent = un.head;
            LinkedList merged = new LinkedList();

            while (uneCurrent != null || unCurrent != null) {
                if (uneCurrent == null) {
                    merged.append(unCurrent.value);
                    unCurrent = unCurrent.next;
                } else if (unCurrent == null) {
                    merged.append(uneCurrent.value);
                    uneCurrent = uneCurrent.next;
                } else {
                    merged.append(uneCurrent.value);
                    merged.append(unCurrent.value);
                    uneCurrent = uneCurrent.next;
                    unCurrent = unCurrent.next;
                }
            }
            return merged.head;
        }
    }
}


