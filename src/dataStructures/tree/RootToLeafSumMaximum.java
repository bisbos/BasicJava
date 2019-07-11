package dataStructures.tree;

/**
                    20

            12                             25

     15         18                   10           7

                    14
 */
public class RootToLeafSumMaximum {

    Node root;
    int maxSum;
    Node maxLeafNode;
    public static void main(String[] args) {

        RootToLeafSumMaximum tree = new RootToLeafSumMaximum();
        tree.root = new Node(20);
        tree.root.leftChild = new Node(12);
        tree.root.leftChild.leftChild = new Node(15);
        tree.root.leftChild.rightChild = new Node(18);
        tree.root.leftChild.rightChild.rightChild = new Node(14);
        tree.root.rightChild = new Node(25);
        tree.root.rightChild.rightChild = new Node(7);
        tree.root.rightChild.leftChild = new Node(10);

        System.out.println(tree.calculateMaximumSum(tree.root,0));

        tree.printpathtoMaxLeafNode(tree.root,tree.maxLeafNode);
        
    }

    public int calculateMaximumSum(Node node,int currSum){
        if (node==null)
            return 0;

        currSum = currSum + node.element;

        if (isLeafNode(node) && currSum>maxSum){
            maxSum = currSum;
            maxLeafNode = node;
        }

        calculateMaximumSum(node.leftChild,currSum);
        calculateMaximumSum(node.rightChild,currSum);

        return maxSum;
    }

    public boolean isLeafNode(Node node){
        return node.leftChild==null && node.rightChild==null;
    }

    public boolean printpathtoMaxLeafNode(Node node,Node maxLeafNode){
        if (node==null)
            return false;
        if (node==maxLeafNode ||
                printpathtoMaxLeafNode(node.leftChild,maxLeafNode) ||
                printpathtoMaxLeafNode(node.rightChild,maxLeafNode)){
            System.out.print(node.element+" ");
            return true;
        }

        return false;
    }


}
