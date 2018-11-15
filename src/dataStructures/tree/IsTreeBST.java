package dataStructures.tree;

public class IsTreeBST {

    Node root;

    public static void main(String[] args) {
        IsTreeBST tree = new IsTreeBST();
        tree.root = new Node(4);
        tree.root.leftChild = new Node(2);
        tree.root.rightChild = new Node(5);
        tree.root.leftChild.leftChild = new Node(1);
        tree.root.leftChild.rightChild = new Node(3);

        System.out.println(isBST(tree.root, Integer.MIN_VALUE,Integer.MAX_VALUE));
    }


    public static boolean isBST(Node root,int max,int min){
        if (null==root)
            return true;
        if (root.element>min || root.element<max)
            return false;
        return isBST(root.leftChild,max,root.element) && isBST(root.rightChild,root.element,min);
    }


}
