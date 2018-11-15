package dataStructures.tree;

/**
 * Size of a tree is the number of elements present in the tree. Size of the below tree is 5.
 */
public class TreeSize {

    Node root;

    public static void main(String[] args) {

        TreeSize tree = new TreeSize();
        tree.root = new Node(1);
        tree.root.leftChild = new Node(2);
        tree.root.leftChild.leftChild = new Node(4);
        tree.root.leftChild.rightChild = new Node(5);
        tree.root.rightChild = new Node(3);

        int size = tree.size(tree.root);
        System.out.println(size);
    }

    public int size(Node node){
        if (node==null)
            return 0;
        return size(node.leftChild)+1+size(node.rightChild);
    }
}
