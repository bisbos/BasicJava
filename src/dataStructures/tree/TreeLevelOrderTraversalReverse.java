package dataStructures.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeLevelOrderTraversalReverse {

    Node root;

    public static void main(String[] args) {

        TreeLevelOrderTraversalReverse tree = new TreeLevelOrderTraversalReverse();
        tree.root = new Node(40);
        tree.root.leftChild = new Node(30);
        tree.root.leftChild.leftChild = new Node(20);
        tree.root.leftChild.rightChild = new Node(35);
        tree.root.rightChild = new Node(60);
        tree.root.rightChild.rightChild = new Node(80);
        tree.root.rightChild.leftChild = new Node(70);

        tree.reverseLevelOrder(tree.root);
    }

    public void reverseLevelOrder(Node root){
        if (root==null)
            return;
        Queue<Node> queue = new LinkedList<>();
        Stack<Node> stack = new Stack<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node node = queue.remove();
            if (node.leftChild!=null){
                queue.add(node.leftChild);
            }
            if (node.rightChild!=null){
                queue.add(node.rightChild);
            }
            stack.push(node);
        }

        while (!stack.isEmpty()){
            Node node = stack.pop();
            System.out.println(node.element);
        }
    }
}
