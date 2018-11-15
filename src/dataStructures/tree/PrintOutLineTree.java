package dataStructures.tree;

import java.util.HashSet;
import java.util.Set;

public class PrintOutLineTree {

    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(6);
        tree.insert(3);
        tree.insert(4);
        tree.insert(2);
        tree.insert(25);
        tree.insert(18);
        tree.insert(30);
        tree.insert(28);
        tree.insert(32);

        tree.inOrderTraversal(tree.root);

        PrintOutLineTree outLineTree = new PrintOutLineTree();


    }

    public Set<Integer> printOutLine(Node root){
        Node current = root;
        Set<Integer> nodeSet = new HashSet<>();

       return nodeSet;
    }

    public boolean isLeafNode(Node node){
        if (node.rightChild==null && node.leftChild==null){
            return true;
        }
        return false;
    }
}
