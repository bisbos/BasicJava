package dataStructures.linkedlistEx;

public class FindMidandDelete {

    Link head;
    public static void main(String[] args) {

        FindMidandDelete linkedList = new FindMidandDelete();
        linkedList.head = new Link(10);
        linkedList.head.next = new Link(20);
        linkedList.head.next.next = new Link(30);
        linkedList.head.next.next.next = new Link(40);
        linkedList.head.next.next.next.next= new Link(50);

        display(linkedList.head);

        deleteMid(linkedList.head);
        display(linkedList.head);

    }

    public static void display(Link head){
        Link current = head;
        while (current!=null){
            System.out.print(current.element +"\t");
            current= current.next;
        }
        System.out.println(" ");
    }

    public static void deleteMid(Link head){
        Link fast = head;
        Link slow = head;
        Link previous = slow;
        while (fast!=null && fast.next!=null){
            previous=slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("Mid Element :"+slow.element);
        previous.next = slow.next;
    }
}
