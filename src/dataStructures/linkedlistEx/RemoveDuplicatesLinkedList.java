package dataStructures.linkedlistEx;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesLinkedList {

    Link head;

    public static void main(String[] args) {
        RemoveDuplicatesLinkedList linkedList = new RemoveDuplicatesLinkedList();
        linkedList.head = new Link(20);
        linkedList.head.next = new Link(10);
        linkedList.head.next.next = new Link(10);
        linkedList.head.next.next.next = new Link(20);
        linkedList.head.next.next.next.next= new Link(50);

        linkedList.head = linkedList.removeDuplicates(linkedList.head);
        linkedList.display(linkedList.head);
    }

    public Link removeDuplicates(Link head){
        Link current = head;
        Link previous = head;
        Set<Integer> resultSet = new HashSet<>();
        while (current!=null){
            if(!resultSet.add(current.element)){
                previous.next = current.next;

            }else {
                previous = current;
            }
                current = current.next;

        }
        return head;
    }

    public static void display(Link head){
        Link current = head;
        while (current!=null){
            System.out.print(current.element +"\t");
            current= current.next;
        }
        System.out.println(" ");
    }
}
