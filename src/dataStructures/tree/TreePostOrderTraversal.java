package dataStructures.tree;

public class TreePostOrderTraversal {

    public void postOrderTraversal(Node root){
        if (null!=root){
            postOrderTraversal(root.leftChild);
            postOrderTraversal(root.rightChild);
            System.out.println(root.element);
        }
    }
}
