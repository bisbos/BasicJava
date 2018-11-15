package dataStructures;

import dataStructures.tree.Node;

/**
 * From a sorted array create a Tree with minimal Height
 *
 * Solution:
 * Middle Element of the array should be Root
 * Left to the Middle element -> Left Children of Tree
 * Right to the Middle element -> Right Children of Tree
 */
public class MinimalTree {

    // createMinimalSubTree(array,0,array.length-1)


    Node createMinimalSubTree(int[] array, int start, int end){
        if (end<start)
            return null;

        int mid = (start+end)/2;
        Node node = new Node(mid);
        node.leftChild = createMinimalSubTree(array,start,mid-1);
        node.rightChild = createMinimalSubTree(array,mid+1,end);
        return node;
    }
}
