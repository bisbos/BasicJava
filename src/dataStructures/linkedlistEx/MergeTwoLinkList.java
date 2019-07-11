package dataStructures.linkedlistEx;

public class MergeTwoLinkList {

    Link head;

    public static void main(String[] args) {
        MergeTwoLinkList linkedList1 = new MergeTwoLinkList();
        linkedList1.head = new Link(10);
        linkedList1.head.next = new Link(20);
        linkedList1.head.next.next = new Link(30);
        linkedList1.head.next.next.next = new Link(40);
        linkedList1.head.next.next.next.next= new Link(50);

        MergeTwoLinkList linkedList2 = new MergeTwoLinkList();
        linkedList2.head = new Link(5);
        linkedList2.head.next = new Link(15);
        linkedList2.head.next.next = new Link(25);
        linkedList2.head.next.next.next = new Link(35);
        linkedList2.head.next.next.next.next= new Link(45);
        linkedList2.head.next.next.next.next.next= new Link(55);
        linkedList2.head.next.next.next.next.next.next= new Link(75);
        linkedList2.head.next.next.next.next.next.next.next= new Link(85);

        Link result = mergeList(linkedList1,linkedList2);
        display(result);
    }

    public static Link mergeList(MergeTwoLinkList linkList1,MergeTwoLinkList linkList2){

        Link result = new Link(0);
        Link temp = result;
        if (linkList1==null){
            temp.next = linkList1.head;
            return result;

        }

        if (linkList2 == null){
            temp.next = linkList2.head;
            return result;
        }

        Link list1 = linkList1.head;
        Link list2 = linkList2.head;

        while (list1.next!=null && list2.next!=null){
            if (list1.element<list2.element){
                temp.next = list1;
                list1 = list1.next;
            }else{
                temp.next= list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        while (list1.next!=null){
            temp.next = list1;
            list1 = list1.next;
            temp = temp.next;
        }

        while (list2.next!=null){
            temp.next = list2;
            list2 = list2.next;
            temp = temp.next;
        }

        return result;
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
