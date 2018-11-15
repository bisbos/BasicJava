package java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SplitIterator {

    public static void main(String[] args) {


        String[] fruitArray = {
                "apple","mango","grapes"
        };
        List<String> fruitList = Arrays.asList(fruitArray);

        Spliterator splitIterator = fruitList.spliterator();
        while(splitIterator.tryAdvance(System.out::println));

    /*    Spliterator splitIterator1 = fruitList.spliterator();
        splitIterator1.forEachRemaining(System.out::println); */

        Spliterator splitIterator2 = fruitList.spliterator();
        Spliterator spliterator3 = splitIterator2.trySplit();
        while(spliterator3.tryAdvance(System.out::println));

    }
}
