package coding.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer array, you have to find all the leader elements in this array.
 * An element is said to be leader if all the elements on it’s right side are smaller than it.
 * Rightmost element is always a leader.
 * For example, if {14, 9, 11, 7, 8, 5, 3} is the given array then {14, 11, 8, 5, 3} are the leaders in this array.
 */

public class LeaderElement {

    public static void main(String[] args) {

        Integer[] elements = {14, 9, 11, 7, 8, 5, 3};
        List<Integer> leaderList = findLeaderElements(elements);
        System.out.println(leaderList.toString());
    }

    public static List<Integer> findLeaderElements(Integer[] elements){
        List<Integer> output = new ArrayList<>();
        int currentElement = elements[elements.length-1];
        output.add(currentElement);
        for (int i=elements.length-2;i>=0;i--){
            if (elements[i]>currentElement){
                output.add(elements[i]);
                currentElement = elements[i];
            }
        }
        return output;
    }
}
