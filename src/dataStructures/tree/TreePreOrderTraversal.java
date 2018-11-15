package dataStructures.tree;

import java.util.Stack;

public class TreePreOrderTraversal {



    public void preOrderTraversal(Node root){
        if (null!=root) {
            System.out.println(root.element);
            preOrderTraversal(root.leftChild);
            preOrderTraversal(root.rightChild);
        }
    }

    public void preOrderTraversalIter(Node root){
        if (root==null){
            return;
        }


        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){
            Node node = stack.pop();
            System.out.println(node.element);

            if (node.rightChild!=null){
                stack.push(node.rightChild);
            }

            if (node.leftChild!=null){
                stack.push(node.leftChild);
            }
        }
    }
}
