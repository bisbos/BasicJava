package dataStructures.tree;

public class TreeTraversalExample {

    Node root;

    public static void main(String[] args) {

        TreeTraversalExample tree = new TreeTraversalExample();
        tree.root = new Node(4);
        tree.root.leftChild = new Node(5);
        tree.root.rightChild = new Node(2);
        tree.root.rightChild.leftChild = new Node(3);
        tree.root.rightChild.leftChild.leftChild = new Node(6);
        tree.root.rightChild.leftChild.rightChild = new Node(7);

    /*    TreePreOrderTraversal preOrder = new TreePreOrderTraversal();
        preOrder.preOrderTraversal(tree.root);
        System.out.println("------------------------");
        preOrder.preOrderTraversalIter(tree.root); */

        TreeInOrderTraversal inOrder = new TreeInOrderTraversal();
        inOrder.inOorderTraversal(tree.root);
        System.out.println("------------------------");
    //    inOrder.inOrderTraversalIter(tree.root);

        TreePostOrderTraversal postOrder = new TreePostOrderTraversal();
    //    postOrder.postOrderTraversal(tree.root);
    }
}
