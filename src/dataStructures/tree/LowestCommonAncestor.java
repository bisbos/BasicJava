package dataStructures.tree;

public class LowestCommonAncestor {

    public Node getLCA(Node root,Node n1,Node n2){
        if (null==root)
            return null;
        if (root==n1 || root ==n2)
            return root;
        Node left = getLCA(root.leftChild,n1,n2);
        Node right = getLCA(root.rightChild,n1,n2);

        if (left!=null&&right!=null)return root;
        if (left==null&&right==null) return null;

        return left!=null?left:right;

    }
}
