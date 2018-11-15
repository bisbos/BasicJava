package dataStructures.tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeLevelOrderTraversal {

    Node root;
    public static void main(String[] args) {

        TreeLevelOrderTraversal tree = new TreeLevelOrderTraversal();
        tree.root = new Node(40);
        tree.root.leftChild = new Node(30);
        tree.root.leftChild.leftChild = new Node(20);
        tree.root.leftChild.rightChild = new Node(35);
        tree.root.rightChild = new Node(60);
        tree.root.rightChild.rightChild = new Node(80);
        tree.root.rightChild.leftChild = new Node(70);

        tree.printLevelOrder(tree.root);
    }

    public void printLevelOrder(Node root){
        if (root==null){
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
                Node node = queue.remove();
                System.out.println(node.element);
                if (node.leftChild!=null){
                    queue.add(node.leftChild);
                }
                if (node.rightChild!=null){
                    queue.add(node.rightChild);
                }
        }
    }
}
