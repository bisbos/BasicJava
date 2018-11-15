package dataStructures.tree;

import java.util.ArrayList;
import java.util.List;


/***
 * Use a path array path[] to store current root to leaf path.
 * Traverse from root to all leaves in top-down fashion.
 * While traversing, store data of all nodes in current path in array path[]. When we reach a leaf node, print the path array.
 */
public class TreePrintPathToLeaf {

    Node root;
    public static void main(String[] args) {

        TreePrintPathToLeaf tree = new TreePrintPathToLeaf();
        tree.root = new Node(40);
        tree.root.leftChild = new Node(30);
        tree.root.leftChild.leftChild = new Node(20);
        tree.root.leftChild.rightChild = new Node(35);
        tree.root.leftChild.leftChild.leftChild = new Node(25);
        tree.root.rightChild = new Node(60);
        tree.root.rightChild.rightChild = new Node(80);
        tree.root.rightChild.leftChild = new Node(70);

        tree.printPathtoLeaf(tree.root,new int[10],0);
    }

    public void printPathtoLeaf(Node node, int[] nodes,int len){
        if (node==null)
            return;

        nodes[len++]= node.element;

        if (node.rightChild==null & node.leftChild==null) {
            printNodes(nodes,len);
            return;
        }

        printPathtoLeaf(node.leftChild,nodes,len);
        printPathtoLeaf(node.rightChild,nodes,len);
    }

    private void printNodes(int[] nodes,int len){
        for (int i=0;i<len;i++){
            System.out.print(nodes[i]+"\t");
        }
        System.out.println();
    }
}
