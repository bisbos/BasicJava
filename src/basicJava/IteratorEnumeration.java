package basicJava;

import java.util.*;

public class IteratorEnumeration {

    public static void main(String[] args) {


        String[] fruitArray = {
                "apple","mango","grapes"
        };
        List<String> fruitList = Arrays.asList(fruitArray);

        System.out.println("Enumeration");
        Enumeration enumeration = Collections.enumeration(fruitList);
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

        System.out.println("Iterator");
        Iterator it = fruitList.iterator();
        while (it.hasNext()){
        //    System.out.println(it.next());
            fruitList.remove("apple");
        //    break;
        }

        System.out.println("ListIterator");
        ListIterator listIterator = fruitList.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

    }

}
