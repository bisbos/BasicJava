package dataStructures.linkedlistEx;

import java.util.Collections;
import java.util.LinkedList;

public class MergeTwoList {

    Link head;

    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.add(40);
        linkedList1.add(20);
        linkedList1.add(50);
        linkedList1.add(10);
        linkedList1.add(30);
        linkedList1.add(60);

        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.add(35);
        linkedList2.add(15);
        linkedList2.add(55);
        linkedList2.add(5);
        linkedList2.add(25);
        linkedList2.add(85);
        linkedList2.add(75);
        linkedList2.add(45);

        Collections.sort(linkedList1);
        Collections.sort(linkedList2);

        LinkedList resultList = mergeLinkedList(linkedList1,linkedList2);
        resultList.forEach(System.out::println);

    }

    public static LinkedList<Integer> mergeLinkedList(LinkedList<Integer> linkedList1,LinkedList<Integer> linkedList2){

        LinkedList<Integer> resultList = new LinkedList<>();
        int i=0,j=0;
        while (i<linkedList1.size() && j<linkedList2.size()){
            if (linkedList1.get(i)<linkedList2.get(j)){
                resultList.add(linkedList1.get(i));
                i++;
            }else{
                resultList.add(linkedList2.get(j));
                j++;
            }
        }

        while (i<linkedList1.size()){
            resultList.add(linkedList1.get(i));
            i++;
        }

        while (j<linkedList2.size()){
            resultList.add(linkedList2.get(j));
            j++;
        }

        return resultList;

    }
}
