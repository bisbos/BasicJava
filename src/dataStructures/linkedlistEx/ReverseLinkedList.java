package dataStructures.linkedlistEx;

//https://www.geeksforgeeks.org/reverse-a-linked-list/
public class ReverseLinkedList {

    Link head;

    public static void main(String[] args) {
        ReverseLinkedList linkList = new ReverseLinkedList();

        linkList.head = new Link(10);
        linkList.head.next = new Link(15);
        linkList.head.next.next = new Link(20);
        linkList.head.next.next.next = new Link(25);
        linkList.head.next.next.next.next = new Link(30);
        linkList.head.next.next.next.next.next = new Link(35);

        display(linkList.head);
        linkList.head=reverseList(linkList.head);
        display(linkList.head);

    }

    /*
        10 -> 15 -> 20
        current =10, previous = null, next =null;
        next = 15, previous =10;current =15;
        10 <- 15 -> 20
        next = 20; previous = 15;current = 20;
        10 <- 15 <- 20
        next = null, previous = 20; current = null
        link = previous
     */
    public static Link reverseList(Link head){
        Link previous = null;
        Link currrent = head;
        Link next = null;
        while (currrent!=null){
            next = currrent.next;
            currrent.next = previous;
            previous = currrent;
            currrent = next;
        }
        head = previous;
        return head;

    }

    public static void display(Link link){
        while (link!=null){
            System.out.print(link.element +"\t");
            link = link.next;
        }
        System.out.println();
    }


}
