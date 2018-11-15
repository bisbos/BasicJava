package dataStructures.tree;

public class TreeEx {

    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(6);
        tree.insert(15);
        tree.insert(25);
        tree.insert(23);
        tree.insert(26);
        tree.insert(12);
        tree.insert(11);
        tree.insert(7);

    /*    System.out.println("=====InOrder Travsersal=======");
        tree.inOrderTraversal(tree.root);

        tree.deleteNode(6);
        System.out.println("=====After Delete=======");
        tree.inOrderTraversal(tree.root); */

        System.out.println("=====PreOrder Travsersal=======");
        tree.preOrderTraversal(tree.root);

        System.out.println("=====PostOrder Travsersal=======");
        tree.postOrderTraversal(tree.root);

    System.out.println(new IsTreeBST().isBST(tree.root,Integer.MIN_VALUE,Integer.MAX_VALUE));


    }
}
