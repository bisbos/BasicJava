package dataStructures.tree;

//https://www.geeksforgeeks.org/check-if-two-trees-are-mirror/
//https://www.geeksforgeeks.org/write-an-efficient-c-function-to-convert-a-tree-into-its-mirror-tree/


/**
 * Check if two tree are mirror
 * Their root node’s key must be same
 * Left subtree of root of ‘a’ and right subtree root of ‘b’ are mirror.
 * Right subtree of ‘a’ and left subtree of ‘b’ are mirror.
 */
public class TreeCreateMirrorAndValidate {

    Node root;

    public static void main(String[] args) {
        TreeCreateMirrorAndValidate tree = new TreeCreateMirrorAndValidate();
        tree.root = new Node(40);
        tree.root.leftChild = new Node(30);
        tree.root.leftChild.leftChild = new Node(20);
        tree.root.leftChild.rightChild = new Node(35);
        tree.root.leftChild.leftChild.leftChild = new Node(25);
        tree.root.rightChild = new Node(60);
        tree.root.rightChild.rightChild = new Node(80);
        tree.root.rightChild.leftChild = new Node(70);

        Node mirrorTree = tree.createMirror(tree.root);

        System.out.println(tree.isMirror(tree.root,mirrorTree));

        Tree tree1 = new Tree();


    }

    public Node createMirror(Node node){
        if (node==null){
            return null;
        }

        Node left = createMirror(node.leftChild);
        Node right = createMirror(node.rightChild);

        node.leftChild = right;
        node.rightChild = left;

        return node;
    }

    public boolean isMirror(Node node1,Node node2){
        if (node1 == null || node2 ==null)
            return false;

        return node1.element == node2.element && isMirror(node1.leftChild,node2.rightChild) && isMirror(node1.rightChild,node2.leftChild);
    }
}
