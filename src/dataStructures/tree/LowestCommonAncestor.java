package dataStructures.tree;

public class LowestCommonAncestor {

    Node root;

    public Node getLCA(Node root,int n1,int n2){
        if (null==root)
            return null;
        if (root.element==n1 || root.element ==n2)
            return root;
        Node left = getLCA(root.leftChild,n1,n2);
        Node right = getLCA(root.rightChild,n1,n2);

        if (left!=null&&right!=null)return root;
        if (left==null&&right==null) return null;

        return left!=null?left:right;

    }

    public static void main(String args[])
    {
        LowestCommonAncestor tree = new LowestCommonAncestor();
        tree.root = new Node(1);
        tree.root.leftChild = new Node(2);
        tree.root.rightChild = new Node(3);
        tree.root.leftChild.leftChild = new Node(4);
        tree.root.leftChild.rightChild = new Node(5);
        tree.root.rightChild.leftChild = new Node(6);
        tree.root.rightChild.rightChild = new Node(7);
        System.out.println("LCA(4, 5) = " +
                tree.getLCA(tree.root,4, 5));
        System.out.println("LCA(4, 6) = " +
                tree.getLCA(tree.root,4, 6));
        System.out.println("LCA(3, 4) = " +
                tree.getLCA(tree.root,3, 4));
        System.out.println("LCA(2, 4) = " +
                tree.getLCA(tree.root,2, 4));
    }
}
