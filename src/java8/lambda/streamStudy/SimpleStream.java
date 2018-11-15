package java8.lambda.streamStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SimpleStream {

    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(15);
        System.out.println(myList);

        //Sort elements
        List<Integer> sortedList = myList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        List<Integer> sortedList1 = myList.stream().sorted(Integer::compareTo).collect(Collectors.toList());
        System.out.println(sortedList1);

        Optional<Integer> maxElement = myList.stream().max(Integer::compareTo);
        maxElement.ifPresent(SimpleStream::display);

        //Use for Each
        myList.stream().forEach(System.out::println);

        //Use Filter
        List<Integer> evenNumbers = myList.stream().filter(element-> element%2==0).collect(Collectors.toList());
        System.out.println(evenNumbers);

    }

    public static void display(Integer element){
        System.out.println(element);
    }
}
