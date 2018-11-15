package dataStructures.tree;

/**
 *
 * The idea is to start from the root and level as 1.
 * If the key matches with root’s data, return level. Else recursively call for left and right subtrees with level as level + 1.
 */
public class TreeGetLevelofNode {

    Node root;

    public static void main(String[] args){
        TreeGetLevelofNode tree = new TreeGetLevelofNode();
        tree.root = new Node(40);
        tree.root.leftChild = new Node(30);
        tree.root.leftChild.leftChild = new Node(20);
        tree.root.leftChild.rightChild = new Node(35);
        tree.root.leftChild.leftChild.leftChild = new Node(25);
        tree.root.rightChild = new Node(60);
        tree.root.rightChild.rightChild = new Node(80);
        tree.root.rightChild.leftChild = new Node(70);

        int level = getLevelOfNode(tree.root,80,1);
        System.out.println(level);
    }

    public static int getLevelOfNode(Node node,int key,int level){
        if (node==null){
            return 0;
        }
        if (node.element==key){
            return level;
        }
        int result = getLevelOfNode(node.leftChild,key,level+1);
        if (result!=0)
            return result;
        result = getLevelOfNode(node.rightChild,key,level+1);
        return result;
    }
}
