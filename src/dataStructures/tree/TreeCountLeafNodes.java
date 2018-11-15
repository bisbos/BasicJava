package dataStructures.tree;


/***
 * getLeafCount(node)
 * 1) If node is NULL then return 0.
 * 2) Else If left and right child nodes are NULL return 1.
 * 3) Else recursively calculate leaf count of the tree using below formula.
 *     Leaf count of a tree = Leaf count of left subtree +
 *                                  Leaf count of right subtree
 */
public class TreeCountLeafNodes {

    Node root;

    public static void main(String[] args) {

        TreeCountLeafNodes tree = new TreeCountLeafNodes();
        tree.root = new Node(40);
        tree.root.leftChild = new Node(30);
        tree.root.leftChild.leftChild = new Node(20);
        tree.root.leftChild.rightChild = new Node(35);
        tree.root.rightChild = new Node(60);
        tree.root.rightChild.rightChild = new Node(80);
        tree.root.rightChild.leftChild = new Node(70);

        System.out.println(countLeafNodes(tree.root));
    }

    public static int countLeafNodes(Node node){
        if (node==null)
            return 0;
        if (node.leftChild==null && node.rightChild==null)
            return 1;
        return countLeafNodes(node.rightChild)+countLeafNodes(node.leftChild);
    }
}
