package dataStructures.linkedlist;

public class LinkedList {

    Link root;

    public void addLast(int element){
        Link newLink = new Link(element);
        if (root==null){
            root = newLink;
        }else {
            Link current = root;
            Link previous = root;
            while (current!=null) {
                previous = current;
                current = current.next;

            }
            current = newLink;
            previous.next = current;
        }
    }

    public void display(Link root){
        Link current = root;
        while (current!=null){
            System.out.println(current.element);
            current = current.next;
        }
    }

    public void addFirst(int element){
        Link newLink = new Link(element);
        if (root==null){
            root = newLink;
        }else {
            Link current = root;
            root = newLink;
            root.next = current;
        }
    }

    public void deleteElement(int element){
        Link current = root;
        Link previous = root;
        while (current!=null){
            if (current.element==element){
                previous.next = current.next;
                break;
            }else {
                previous = current;
                current = current.next;
            }
        }
    }

    public void deleteElementPosition(int position){
        Link current = root;
        Link previous = root;
        int count =0;
        while (current!=null){
            if (count==position){
                previous.next = current.next;
                break;
            }else{
                previous = current;
                current = current.next;
                count++;
            }
        }
    }

    public void addElementPosition(int position,int element){
        Link current = root;
        Link previous = root;
        int count =0;
        Link newLink = new Link(element);
        while (current!=null){
            if (count==position){
                Link temp = current.next;
                previous = current;
                current = newLink;
                previous.next = current;
                current.next = temp;
                break;
            }else {
                previous = current;
                current = current.next;
                count++;
            }
        }
    }

    public void deleteMid(){
        Link cursor1=root;
        Link cursor2=root;
        while (cursor1!=null & cursor1.next!=null){
            cursor1 = cursor1.next.next;
            cursor2 = cursor2.next;
        }
        Link current = root;
        Link previous = root;
        while (current!=null){
            if(current.element==cursor2.element){
                previous.next = current.next;
                break;
            }else {
                previous = current;
                current = current.next;
            }
        }

    }

    public void deleteFirst(){
        if (root!=null){
            root = root.next;
        }
    }

    public Link reverseList(Link root){
        Link next = null;
        Link previous = null;
        Link current = root;
        while (current!=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

}
