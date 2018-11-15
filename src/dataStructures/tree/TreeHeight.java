package dataStructures.tree;

/**
 *
 * https://www.geeksforgeeks.org/write-a-c-program-to-find-the-maximum-depth-or-height-of-a-tree/
 * Height of empty tree is 0 and height of below tree is 3.
 *
 * Solution
 * Recursively calculate height of left and right subtrees of a node and
 * assign height to the node as max of the heights of two children plus 1.
 */
public class TreeHeight {

    Node root;

    public static void main(String[] args) {

        TreeHeight tree = new TreeHeight();
    /*    tree.root = new Node(40);
        tree.root.leftChild = new Node(20);
        tree.root.leftChild.leftChild = new Node(10);
        tree.root.leftChild.rightChild = new Node(30);
        tree.root.leftChild.rightChild.leftChild = new Node(40);
        tree.root.leftChild.leftChild.rightChild = new Node(5);
        tree.root.leftChild.leftChild.rightChild.rightChild = new Node(45);
        tree.root.rightChild = new Node(60);
        tree.root.rightChild.rightChild = new Node(70);
        tree.root.rightChild.leftChild = new Node(50);
        tree.root.rightChild.leftChild.rightChild = new Node(65); */

        tree.root = new Node(1);
        tree.root.leftChild = new Node(2);
        tree.root.leftChild.leftChild = new Node(4);
        tree.root.leftChild.rightChild = new Node(5);
        tree.root.rightChild = new Node(3);

        int height = tree.treeHeight(tree.root);
        System.out.println(height);
    }

    public int treeHeight(Node node){
      if (node==null)
          return 0;

      int ldepth = treeHeight(node.leftChild);
      int rdepth = treeHeight(node.rightChild);

      if (ldepth>rdepth){
          return ldepth+1;
      }else{
          return rdepth+1;
      }

    }
}
