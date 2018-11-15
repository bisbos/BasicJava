package java8.lambda.streamStudy;

import java.util.ArrayList;
import java.util.Optional;

public class ReduceOperation {

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(15);
        System.out.println(myList);

        Optional<Integer> result = myList.stream().reduce((a, b)->a*b);
        result.ifPresent(System.out::println);

        //
        int result1 = myList.stream().reduce(1,(a,b)->a*b);
        System.out.println(result1);
    }
}
