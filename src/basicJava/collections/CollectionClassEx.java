package basicJava.collections;

import java.util.*;

public class CollectionClassEx {

    public static void main(String[] args) {


        String[] fruitArray = {
                "apple","mango","grapes"
        };
        List<String> fruitList = Arrays.asList(fruitArray);

        //How to make an ArrayList Synchronized
        List<String> synchronizedList = Collections.synchronizedList(fruitList);

        //How to create a Set from List
        Set<String> fruitSet = new HashSet<>();
        fruitSet.addAll(fruitList);


        //Make Set Synchronized
        Set<String> synchronizedSet =  Collections.synchronizedSet(fruitSet);

        Collections.sort(fruitList);
        System.out.println(fruitList);
    }

}
