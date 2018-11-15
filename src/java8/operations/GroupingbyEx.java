package java8.operations;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Group By, Sort and Count
 */
public class GroupingbyEx {

    public static void main(String[] args) {


        //Count of words in a List
        List<String> items = Arrays.asList("apple","banana","grapes","apple","orange","banana","grapes","orange","apple","grapes","banana","apple","grapes");

        Map<String,Long> countItems = items.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countItems);

        //Sort Items By Key
        Map<String,Long> sortedItems = countItems.entrySet().stream().sorted(Map.Entry.comparingByKey()).
                collect(Collectors.toMap(e->e.getKey(),e-> e.getValue(),(e1,e2)->e2,LinkedHashMap::new));
        System.out.println(sortedItems);

        //Sort Items reverseOrder
        Map<String,Long> sortedItemsReversed =  countItems.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).
                collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e2,LinkedHashMap::new));
        System.out.println(sortedItemsReversed);

        //Item with Maximum count
        items.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
                entrySet().stream();


    }
}
