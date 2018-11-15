package dataStructures.tree;

public class TreePrintLeafNodes {

    Node root;

    public static void main(String[] args) {

        TreePrintLeafNodes tree = new TreePrintLeafNodes();
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

        tree.printLeafNodes(tree.root);
    }

    public void printLeafNodes(Node root){
            if (root==null)
                return;

            if (root.leftChild==null && root.rightChild==null){
                System.out.println(root.element);
            }
            printLeafNodes(root.leftChild);
            printLeafNodes(root.rightChild);

    }
}
