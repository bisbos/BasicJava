package dataStructures.treePrograms;

import java.util.Stack;

public class PrintLeftNodesTree {

    Node root;
    public static void main(String[] args) {

        PrintLeftNodesTree tree = new PrintLeftNodesTree();
        tree.root = new Node(4);
        tree.root.leftChild = new Node(5);
        tree.root.rightChild = new Node(2);
        tree.root.rightChild.leftChild = new Node(3);
        tree.root.rightChild.leftChild.leftChild = new Node(6);
        tree.root.rightChild.leftChild.rightChild = new Node(7);

        //4 5 3 6

    }

    public void printLeftNode(Node root){
        if (root==null){
            return;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){

        }
    }
}

