package dataStructures.tree;

public class Node {

    int element;
    public Node leftChild;
    public Node rightChild;
    String value;

    public Node(int element){
        this.element = element;
    }

    public Node(String value){
        this.value = value;
    }
}
