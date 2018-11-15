package java8.lambda.streamStudy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapEx {

    public static void main(String[] args) {


        List<String> itemList = Arrays.asList("apple","banana","grapes");
        List<String> upperItemList = itemList.stream().map(item -> item.toUpperCase()).collect(Collectors.toList());
     //   upperItemList.forEach(System.out::println);


     /*   List<String> upperItemsList = Stream.of(Arrays.asList("apple","banana","grapes"),Arrays.asList("wheat","rice","bread")).
                flatMap(items -> items.stream()).map(item -> item.toUpperCase()).collect(Collectors.toList()); */
        List<String> upperItemsList = Stream.of(Arrays.asList("apple","banana","grapes"),Arrays.asList("wheat","rice","bread")).
                flatMap(List::stream).map(String::toUpperCase).collect(Collectors.toList());
        upperItemsList.forEach(System.out::println);


    }
}
