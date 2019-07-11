package dataStructures.linkedlistEx;

public class LinkedListDelMid {

    Link head;

    public static void main(String[] args) {

        LinkedListDelMid linkedListEx = new LinkedListDelMid();
        linkedListEx.addFirst(10);
        linkedListEx.addFirst(5);
        linkedListEx.addFirst(3);
        linkedListEx.addFirst(6);
        linkedListEx.addFirst(2);

        linkedListEx.display();

        linkedListEx.deleteMid();
        System.out.println("-----------------");
        linkedListEx.display();

    }

    public void addFirst(int element){
        Link newLink = new Link(element);
        newLink.next = head;
        head = newLink;
    }

    public void display(){
        Link current = head;
        while (null!=current){
            System.out.println(current.element);
            current = current.next;
        }
    }

    public void deleteMid(){
        Link fast = head;
        Link previous = head;
        Link slow = head;
        while (null != fast.next && null != fast.next.next){
            previous = slow;
            slow = fast.next;
            fast = fast.next.next;
        }
        previous.next = slow;
    }
}
