package code401Challenges.Graph;


import java.util.HashSet;


public class Graph<T> {
    private HashSet<Node<T>> nodes;

    // constructor
    public Graph(){
        this.nodes = new HashSet<>();
    }
    // Add nodes to the Graph

    public Node<T> addNode(T data){
        Node node = new Node(data);
            this.nodes.add(node);

        return node;
    }
    // add edge between two nodes
    public boolean addEdge(Node<T> one, Node two){

        if((this.nodes.contains(one)) && (this.nodes.contains(two))){
            one.addNeighbor(two);
            two.addNeighbor(one);
            return true;
        }
        return false;
    }

    // add edge and a weight
    public boolean addEdge(Node<T> one, Node two, int weight){

        if((this.nodes.contains(one)) && (this.nodes.contains(two))){
            one.addNeighbor(two,weight);
            two.addNeighbor(one,weight);
            return true;
        }
        return false;
    }
    // Return all nodes in the graph as a set
        public HashSet<Node<T>> getNodes(){
        return this.nodes;
        }

    // Return all neighbors of a node and their weights
    public HashSet<Edge> getNeighbors(Node<T> node){
        return node.neighbors;
    }

    // Return the number of nodes in the graph
    public int size(){

        return this.nodes.size();
    }
}
