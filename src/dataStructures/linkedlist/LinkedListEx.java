package dataStructures.linkedlist;

public class LinkedListEx {

    Link first;

    public static void main(String[] args) {

        LinkedListEx linkedListEx = new LinkedListEx();
        linkedListEx.addFirst(10);
        linkedListEx.addFirst(5);
        linkedListEx.addFirst(3);
        linkedListEx.addFirst(6);
        linkedListEx.addFirst(2);

        linkedListEx.display();

        System.out.println();

        linkedListEx.deleteElement(1);
        linkedListEx.display();
    }

    public void addFirst(int element){
      Link newLink = new Link(element);
      newLink.next = first;
      first = newLink;
    }

    public void display(){
        Link current = first;
       while (null!=current){
           System.out.print(current.element+"\t");
           current = current.next;
       }
    }

    public void deleteElement (int position){
            Link current = first;
            Link previous = first;
            int index =1;
            while (null!=current){
                if (index==position){
                    if (position==1){
                        first = first.next;
                        break;
                    }else {
                        previous.next = current.next;
                        break;
                    }
                }else {
                    previous = current;
                    current = current.next;
                    index++;
                }
            }

    }
}

