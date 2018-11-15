package dataStructures.linkedlist;

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

        linkList.head=reverseList(linkList.head);
        display(linkList.head);

    }

    public static Link reverseList(Link link){
        Link previous = null;
        Link currrent = link;
        Link next = null;
        while (currrent!=null){
            next = currrent.next;
            currrent.next = previous;
            previous = currrent;
            currrent = next;
        }
        link = previous;
        return link;

    }

    public static void display(Link link){
        while (link!=null){
            System.out.print(link.element +"\t");
            link = link.next;
        }
        System.out.println();
    }


}
