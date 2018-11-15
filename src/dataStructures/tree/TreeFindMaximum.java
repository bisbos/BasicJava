package dataStructures.tree;

/**
 * In Binary Search tree, maximum element will be rightmost node
 *
 * In Binary Search Tree, we can find maximum by traversing right pointers until we reach rightmost node. But in Binary Tree,
 * we must visit every node to figure out maximum. So the idea is to traverse the given tree and for every node return maximum of 3 values.
 * 1) Node’s data.
 * 2) Maximum in node’s left subtree.
 * 3) Maximum in node’s right subtree.
 *
 */
public class TreeFindMaximum {

    Node root;
    int maximum = Integer.MIN_VALUE;
    public static void main(String[] args) {

        TreeFindMaximum tree = new TreeFindMaximum();
        tree.root = new Node(40);
        tree.root.leftChild = new Node(30);
        tree.root.leftChild.leftChild = new Node(20);
        tree.root.leftChild.rightChild = new Node(35);
        tree.root.leftChild.leftChild.leftChild = new Node(25);
        tree.root.rightChild = new Node(60);
        tree.root.rightChild.rightChild = new Node(80);
        tree.root.rightChild.leftChild = new Node(70);

        System.out.println(getMax(tree.root));
    }

    public static int getMax(Node node){
        if (node==null){
            return Integer.MIN_VALUE;
        }
        int max = node.element;
        int lMax = getMax(node.leftChild);
        int rMax = getMax(node.rightChild);

        if(lMax>max){
            max = lMax;
        }if (rMax>max){
            max = rMax;
        }
        return max;
    }


    public int getMaximum(Node node){
        if (node!=null){
            if (maximum<node.element) {
                maximum = node.element;
            }
            getMaximum(node.leftChild);
            getMaximum(node.rightChild);
        }
        return maximum;
    }
}
