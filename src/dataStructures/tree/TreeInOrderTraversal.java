package dataStructures.tree;

import java.util.Stack;

public class TreeInOrderTraversal {

    public void inOorderTraversal(Node root){
        if (root!=null){
            inOorderTraversal(root.leftChild);
            System.out.println(root.element);
            inOorderTraversal(root.rightChild);
        }
    }

    public void inOrderTraversalIter(Node root){
        if (root==null){
            return;
        }

        Node currentNode = root;
        Stack<Node> stack = new Stack<>();
        while (!stack.isEmpty() || currentNode!=null){
            if (currentNode!=null){
                stack.push(currentNode);
                currentNode = currentNode.leftChild;
            }else {
                Node node = stack.pop();
                System.out.println(node.element);
                currentNode = node.rightChild;
            }
        }
    }
}
