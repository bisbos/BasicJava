package dataStructures.tree;


public class RootToLeafSumMatch {

    Node root;
    boolean isMatch = false;
    public static void main(String[] args) {
        int sum = 55;
        RootToLeafSumMatch tree = new RootToLeafSumMatch();
        tree.root = new Node(20);
        tree.root.leftChild = new Node(12);
        tree.root.leftChild.leftChild = new Node(15);
        tree.root.leftChild.rightChild = new Node(18);
        tree.root.leftChild.rightChild.rightChild = new Node(14);
        tree.root.rightChild = new Node(25);
        tree.root.rightChild.rightChild = new Node(7);
        tree.root.rightChild.leftChild = new Node(10);

        System.out.println(tree.isSumMatch(tree.root,0,sum));

    }

    public boolean isSumMatch(Node node,int currSum,int sum){
        if (node==null){
            return (sum==0);
        }
        currSum = currSum + node.element;
        if (isLeafNode(node)){
            if (sum==currSum){
                isMatch = true;
            }
        }
        isSumMatch(node.leftChild,currSum,sum);
        isSumMatch(node.rightChild,currSum,sum);
        return isMatch;
    }

    public boolean isLeafNode(Node node){
        return node.leftChild==null && node.rightChild==null;
    }
}
