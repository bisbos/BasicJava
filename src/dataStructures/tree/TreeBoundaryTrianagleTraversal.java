package dataStructures.tree;

//40 20 10 5 45 55 85 70 60
public class TreeBoundaryTrianagleTraversal {

    Node root;

    public static void main(String[] args) {

        TreeBoundaryTrianagleTraversal tree = new TreeBoundaryTrianagleTraversal();
        tree.root = new Node(40);
        tree.root.leftChild = new Node(20);
        tree.root.leftChild.leftChild = new Node(10);
        tree.root.leftChild.rightChild = new Node(30);
        tree.root.leftChild.leftChild.leftChild = new Node(5);
        tree.root.leftChild.leftChild.rightChild = new Node(45);
        tree.root.rightChild = new Node(60);
        tree.root.rightChild.rightChild = new Node(70);
        tree.root.rightChild.leftChild = new Node(50);
        tree.root.rightChild.rightChild.leftChild = new Node(55);
        tree.root.rightChild.rightChild.rightChild = new Node(85);

        System.out.println(tree.root.element);
        tree.printBoundaryTriangleLeft(tree.root.leftChild);
        tree.printBoundaryTriangleRight(tree.root.rightChild);

        int level = tree.levelOfTree(tree.root);
        System.out.println("Level :"+level);
    }

    public void printBoundaryTriangleLeft(Node node){
        if (node==null)
            return;

        System.out.println(node.element);
        if (node.leftChild!=null){
            printBoundaryTriangleLeft(node.leftChild);
        }else if (node.rightChild!=null){
            printBoundaryTriangleRight(node.rightChild);
        }

    }

    public void printBoundaryTriangleRight(Node node){
        if (node==null)
            return;

        if (node.rightChild!=null){
            printBoundaryTriangleRight(node.rightChild);
        }else if (node.leftChild!=null){
            printBoundaryTriangleRight(node.leftChild);
        }
        System.out.println(node.element);
    }

    public int levelOfTree(Node node){
        if (node==null)
            return 0;
        return levelOfTree(node.leftChild)+1;
    }
}
