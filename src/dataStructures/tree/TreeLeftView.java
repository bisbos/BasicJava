package dataStructures.tree;

import java.util.LinkedList;
import java.util.Queue;

// 4 5 3 6
public class TreeLeftView {

    Node root;

    public static void main(String[] args) {

        TreeLeftView tree = new TreeLeftView();
    /*    tree.root = new Node(4);
        tree.root.leftChild = new Node(5);
        tree.root.rightChild = new Node(2);
        tree.root.rightChild.rightChild = new Node(1);
        tree.root.rightChild.leftChild = new Node(3);
        tree.root.rightChild.leftChild.leftChild= new Node(6);
        tree.root.rightChild.leftChild.rightChild = new Node(7); */

        tree.root = new Node(40);
        tree.root.leftChild = new Node(20);
        tree.root.leftChild.leftChild = new Node(10);
        tree.root.leftChild.rightChild = new Node(30);
        tree.root.leftChild.rightChild.leftChild = new Node(40);
        tree.root.leftChild.leftChild.rightChild = new Node(5);
        tree.root.leftChild.leftChild.rightChild.rightChild = new Node(45);
        tree.root.rightChild = new Node(60);
        tree.root.rightChild.rightChild = new Node(70);
        tree.root.rightChild.leftChild = new Node(50);
        tree.root.rightChild.leftChild.rightChild = new Node(65);


       tree.printLeftView(tree.root);
    //    tree.leftViewRecur(tree.root,1);

    }

    public void printLeftView(Node node){
        boolean isFirstNode = false;
        if (node==null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        queue.add(null);
        System.out.println(node.element);
        while (!queue.isEmpty()){
            Node currentNode = queue.remove();
            if (currentNode==null){
                isFirstNode = true;
                queue.add(null);
            }else {
                if (isFirstNode){
                    System.out.println(currentNode.element);
                    isFirstNode = false;
                }
                if (currentNode.leftChild!=null){
                    queue.add(currentNode.leftChild);
                }
                if (currentNode.rightChild!=null){
                    queue.add(currentNode.rightChild);
                }
            }


        }
    }

    int maxLevel =0;
    public void leftViewRecur(Node node,int level){
        if (node==null){
            return;
        }

        if (maxLevel<level) {
                System.out.println(node.element);
                maxLevel = level;
        }

        leftViewRecur(node.leftChild,level+1);
        leftViewRecur(node.rightChild,level+1);

    }
}
