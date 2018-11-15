package dataStructures.tree;


import java.util.HashSet;
import java.util.Set;

// 40 20 10 5 45 30 55 70 60
public class TreeBoundaryTraversal {

    Node root;

    public static void main(String[] args) {
        TreeBoundaryTraversal tree = new TreeBoundaryTraversal();
        tree.root = new Node(40);
        tree.root.leftChild = new Node(20);
        tree.root.leftChild.leftChild = new Node(10);
        tree.root.leftChild.rightChild = new Node(30);
        tree.root.leftChild.leftChild.rightChild = new Node(5);
        tree.root.leftChild.leftChild.rightChild.rightChild = new Node(45);
        tree.root.rightChild = new Node(60);
        tree.root.rightChild.rightChild = new Node(70);
        tree.root.rightChild.leftChild = new Node(50);
        tree.root.rightChild.leftChild.rightChild = new Node(55);

        System.out.println(tree.root.element);
        tree.printLeftEdgeNodes(tree.root.leftChild);
        tree.printLeafNodes(tree.root);
        tree.printRightEdgeNodesBottumUp(tree.root.rightChild);



    }

    public void printLeftEdgeNodes(Node node){

        if (node.leftChild==null && node.rightChild==null){
            return;
        }
        System.out.println(node.element);
        if (node.leftChild!=null){
            printLeftEdgeNodes(node.leftChild);
        }else if (node.rightChild!=null){
            printLeftEdgeNodes(node.rightChild);
        }

    }

    public void printLeafNodes(Node node){
        if (node==null){
            return;
        }
        if (node.leftChild==null&&node.rightChild==null){
            System.out.println(node.element);
            return;
        }
            printLeafNodes(node.leftChild);
            printLeafNodes(node.rightChild);

    }

    public void printRightEdgeNodesBottumUp(Node node){

        if (node.leftChild==null && node.rightChild==null){
            return;
        }

        if (node.rightChild!=null){
            printRightEdgeNodesBottumUp(node.rightChild);
        }else if (node.leftChild!=null){
            printRightEdgeNodesBottumUp(node.leftChild);
        }
        System.out.println(node.element);

    }
}
