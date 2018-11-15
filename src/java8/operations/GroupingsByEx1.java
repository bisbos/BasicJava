package java8.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingsByEx1 {

    public static void main(String[] args) {

        List<String> itemList = Arrays.asList("apple","banana","grapes","apple","orange","banana","grapes","orange","apple","grapes","banana","apple","grapes");

        //Count of items
     //   Map<String,Long> itemGroup = itemList.stream().collect(Collectors.groupingBy(item->item,Collectors.counting()));
        Map<String,Long> itemGroup = itemList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(itemGroup);



    }
}
