package basicJava.arraysAndNumbers;


import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer array, you have to find all the leader elements in this array.
 * An element is said to be leader if all the elements on it’s right side are smaller than it.
 * Rightmost element is always a leader.
 * For example, if {14, 9, 11, 7, 8, 5, 3} is the given array then {14, 11, 8, 5, 3} are the leaders in this array.
 */
public class LeadingElement {

    public static void main(String[] args) {

        Integer[] elements = {14, 9, 11, 7, 8, 5, 3};
        List<Integer> leaderList = findLeaderElements(elements);
        System.out.println(leaderList.toString());
    }

    public static List<Integer> findLeaderElements(Integer[] elements){
       List<Integer> leaderElements = new ArrayList<>();
       Integer leaderElement = elements[elements.length-1];
       leaderElements.add(leaderElement);
       for (int i=elements.length-2;i>0;i--){
           if (elements[i]>leaderElement){
               leaderElement = elements[i];
               leaderElements.add(leaderElement);
           }
       }
       return leaderElements;
    }
}
