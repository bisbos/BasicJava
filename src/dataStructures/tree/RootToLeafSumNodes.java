package dataStructures.tree;

/*
https://www.geeksforgeeks.org/sum-numbers-formed-root-leaf-paths/

Sum of all the numbers that are formed from root to leaf paths
Given a binary tree, where every node value is a Digit from 1-9 .Find the sum of all the numbers which are formed from root to leaf paths.
For example consider the following Binary Tree.

                                          6
                                      /      \
                                    3          5
                                  /   \          \
                                 2     5          4
                                      /   \
                                     7     4
  There are 4 leaves, hence 4 root to leaf paths:
   Path                    Number
  6->3->2                   632
  6->3->5->7               6357
  6->3->5->4               6354
  6->5>4                    654
Answer = 632 + 6357 + 6354 + 654 = 13997
 */
public class RootToLeafSumNodes {

    Node root;
    int pathSum=0;
    public static void main(String[] args) {
        RootToLeafSumNodes tree = new RootToLeafSumNodes();
        tree.root = new Node(6);
        tree.root.leftChild = new Node(3);
        tree.root.leftChild.leftChild = new Node(2);
        tree.root.leftChild.rightChild = new Node(5);
        tree.root.leftChild.rightChild.leftChild=new Node(7);
        tree.root.leftChild.rightChild.rightChild=new Node(4);
        tree.root.rightChild= new Node(5);
        tree.root.rightChild.rightChild=new Node(4);

        System.out.println(tree.calculateSumofNodes(tree.root,0));
    }

    public int calculateSumofNodes(Node node,int currSum){
       if (node==null)
           return 0;

        currSum = currSum*10+node.element;

       if (isLeafNode(node)){
           pathSum = pathSum+currSum;
       }

        calculateSumofNodes(node.leftChild,currSum);
        calculateSumofNodes(node.rightChild,currSum);
        return pathSum;
    }

    public boolean isLeafNode(Node node){
        return node.leftChild==null && node.rightChild==null;
    }
}
